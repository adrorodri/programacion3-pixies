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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenidos);

    }

    @Override
    public void onBackPressed() {

    }
}
