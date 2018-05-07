package com.programacion3.pixies.app;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;
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

        // TODO: Get intent extra, Category???

        recyclerView = findViewById(R.id.recycler_view_productos);

        productoList = dbController.getAllProducts();


//        productoList = new LinkedList<>();
//        productoList.add(new Producto(R.drawable.andys_blanco,10,20,"cereal_1"));
//        productoList.add(new Producto(R.drawable.andys_blanco,10,20,"cereal_2"));
//        productoList.add(new Producto(R.drawable.andys_blanco,10,20,"cereal_3"));
//        productoList.add(new Producto(R.drawable.andys_blanco,10,20,"cereal_4"));
//        productoList.add(new Producto(R.drawable.andys_blanco,10,20,"cereal_5"));
//        productoList.add(new Producto(R.drawable.andys_blanco,10,20,"cereal_6"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager = layoutManager;

        ProductosAdapter adapter = new ProductosAdapter(this,productoList);

        recyclerView.setLayoutManager(rvLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {

    }
}

