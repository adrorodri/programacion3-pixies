package com.programacion3.pixies.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

/**
 * Created by Mateo on 01/05/2018.
 */


public class BienvenidosActivity extends DrawerActivity{
    String category;
    DBController dbController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenidos);
        dbController = new DBController(this, "Productos.db", null, 1);


    }
    public void clickCategorias(View view){
        Intent intent;

        switch (view.getId()) {
            case R.id.cereales_button: {
                intent = new Intent(this, ProductosActivity.class);
                // TODO: Put intent extra
                intent.putExtra("Cereales",category);
                startActivity(intent);
                break;
            }
            case R.id.lacteos_button: {
                intent = new Intent(this, ProductosActivity.class);
                intent.putExtra("Lacteos",category);
                startActivity(intent);
                break;
            }
            case R.id.bebidas_button: {
                intent = new Intent(this, ProductosActivity.class);
                intent.putExtra("Bebidas",category);
                startActivity(intent);
                break;
            }
            case R.id.panaderia_button: {
                intent = new Intent(this, ProductosActivity.class);
                intent.putExtra("Panaderia",category);
                startActivity(intent);
                break;
            }
            case R.id.aseo_button: {
                intent = new Intent(this, ProductosActivity.class);
                intent.putExtra("Aseo",category);
                startActivity(intent);
                break;
            }

        }
    }

    @Override
    public void onBackPressed() {

    }
}
