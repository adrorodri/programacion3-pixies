package com.programacion3.pixies.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoriasActivity extends DrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

    }
    public void click(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.cereales: {
                intent = new Intent(this, CerealesActivity.class);
                startActivity(intent);
                break;
            }


        }
    }
    @Override
    public void onBackPressed() {

    }
}
