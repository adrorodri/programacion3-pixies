package com.programacion3.pixies.app;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mateo on 01/05/2018.
 */

public class BienvenidosActivity extends DrawerActivity{

    List<Producto> productoList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_layout);

        productoList.add(new Producto(1,20,10,"producto1",R.drawable.alcancia));
        productoList.add(new Producto(1,20,10,"producto2",R.drawable.alcancia2));
        productoList.add(new Producto(1,20,10,"producto3",R.drawable.alcancia3));
        productoList.add(new Producto(1,20,10,"producto4",R.drawable.alcancia4));
        productoList.add(new Producto(1,20,10,"producto5",R.drawable.alcancia5));
        productoList.add(new Producto(1,20,10,"producto6",R.drawable.alcancia6));
        productoList.add(new Producto(1,20,10,"producto7",R.drawable.alcancia));
        productoList.add(new Producto(1,20,10,"producto8",R.drawable.alcancia2));
        productoList.add(new Producto(1,20,10,"producto9",R.drawable.alcancia3));
        productoList.add(new Producto(1,20,10,"producto10",R.drawable.alcancia4));
        productoList.add(new Producto(1,20,10,"producto11",R.drawable.alcancia5));
        productoList.add(new Producto(1,20,10,"producto12",R.drawable.alcancia6));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,productoList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {

    }
}
