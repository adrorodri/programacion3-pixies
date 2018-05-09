package com.programacion3.pixies.app.UI.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.programacion3.pixies.app.Controler.DBController;
import com.programacion3.pixies.app.Model.Producto;
import com.programacion3.pixies.app.UI.Adapters.ProductosAdapter;
import com.programacion3.pixies.app.R;

import java.util.List;

/**
 * Created by Mateo on 02/05/2018.
 */

public class ProductosActivity extends DrawerActivity {

    List<Producto> productoList;
    RecyclerView recyclerView;
    DBController dbController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        dbController = new DBController(this, "Productos.db", null, 1);

        Intent intent = getIntent();
        String categoryRecep;
        recyclerView = findViewById(R.id.recycler_view_productos);
        categoryRecep = intent.getStringExtra("Category");
        productoList = dbController.getAllProducts();
        productoList = dbController.getAllProductsByCategory(categoryRecep);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager = layoutManager;

        ProductosAdapter adapter = new ProductosAdapter(this,productoList);

        recyclerView.setLayoutManager(rvLayoutManager);
        recyclerView.setAdapter(adapter);
    }

}

