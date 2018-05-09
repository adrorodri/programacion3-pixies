package com.programacion3.pixies.app.UI.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.programacion3.pixies.app.UI.Adapters.CarritoAdapter;
import com.programacion3.pixies.app.Controler.DBController;
import com.programacion3.pixies.app.Model.Producto;
import com.programacion3.pixies.app.R;
import com.programacion3.pixies.app.Controler.SharedPreferencesController;

import java.util.List;

public class CarritoActivity extends DrawerActivity{
    TextView deseas_cerrar;
    Button si, no;
    RecyclerView recyclerView;
    Dialog gracias_dialog;
    List<Producto> productoList;
    DBController dbController;
    SharedPreferencesController sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = new SharedPreferencesController(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        recyclerView = findViewById(R.id.recycler_view_carrito);
        dbController = new DBController(this, "Carrito.db", null, 1);

        productoList = dbController.selectCarrito(sharedPreferences.getUsuario());

        Button comprar_carrito = (Button) findViewById(R.id.comprar_carrito);
        comprar_carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbController.comprarCarrito(sharedPreferences.getUsuario());
                gracias_dialog= new Dialog(CarritoActivity.this);
                gracias_dialog.setContentView(R.layout.activity_custom_dialog_cerrar);
                deseas_cerrar= (TextView) gracias_dialog.findViewById(R.id.deseas_cerrar_sesion);
                si = (Button) gracias_dialog.findViewById(R.id.si);
                no = (Button) gracias_dialog.findViewById(R.id.no);
                si.setEnabled(true);
                no.setEnabled(true);
                gracias_dialog.show();
              //  Toast.makeText(CarritoActivity.this, "Gracias por su compra!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(CarritoActivity.this,BienvenidosActivity.class);
                startActivity(intent);

            }
        });

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager = layoutManager;

        CarritoAdapter adapter = new CarritoAdapter(this,productoList);

        recyclerView.setLayoutManager(rvLayoutManager);
        recyclerView.setAdapter(adapter);
    }

}
