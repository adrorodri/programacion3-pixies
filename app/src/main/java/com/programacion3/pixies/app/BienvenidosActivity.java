package com.programacion3.pixies.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Mateo on 01/05/2018.
 */


public class BienvenidosActivity extends DrawerActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenidos);

    }
    public void clickCategorias(View view){
        Intent intent;

        switch (view.getId()) {
            case R.id.cereales_button: {
                intent = new Intent(this, ProductosActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.lacteos_button: {
                intent = new Intent(this, ProductosActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.bebidas_button: {
                intent = new Intent(this, ProductosActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.panaderia_button: {
                intent = new Intent(this, ProductosActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.aseo_button: {
                intent = new Intent(this, ProductosActivity.class);
                startActivity(intent);
                break;
            }

        }
    }

    @Override
    public void onBackPressed() {

    }
}
