package com.programacion3.pixies.app;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ConfiguracionActivity extends DrawerActivity {
    TextView cerrar;
    Dialog cerrarDialog;
    Button si,no;
    Intent intent;
    LayoutInflater inflater;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        cerrar = (TextView)findViewById(R.id.cerrarSesion);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            cerrarDialog();
            }
        });
    }

    public void cerrarDialog() {

        View layout = inflater.inflate(R.layout.activity_custom_dialog_cerrar, null);
        si = (Button) cerrarDialog.findViewById(R.id.si);
        no = (Button) cerrarDialog.findViewById(R.id.no);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("¿Estás seguro que deseas salir?");
        builder.setView(layout);
        AlertDialog alertDialog = builder.create();

        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ConfiguracionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            cerrarDialog.cancel();
            }
        });
        alertDialog.show();

    }

    @Override
    public void onBackPressed() {

    }
}
