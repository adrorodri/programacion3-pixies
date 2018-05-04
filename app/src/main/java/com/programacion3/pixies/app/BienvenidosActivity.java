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

        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));
        productoList.add(new Producto(R.drawable.alcancia,10,20,"producto1"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,productoList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {

    }
}
