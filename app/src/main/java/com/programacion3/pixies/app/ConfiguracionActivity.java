package com.programacion3.pixies.app;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracionActivity extends DrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
    }
    public void clickButton(View view){
        View layout = getLayoutInflater().inflate(R.layout.activity_custom_dialog_comprar, null);
        Button button = layout.findViewById(R.id.comprarCustomDialog);
        button.setText("COMPRAR");
        AlertDialog.Builder builder = new AlertDialog.Builder(ConfiguracionActivity.this);
        builder.setTitle("¿Deseas comprar este producto?");
        builder.setView(layout);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {

    }
}
