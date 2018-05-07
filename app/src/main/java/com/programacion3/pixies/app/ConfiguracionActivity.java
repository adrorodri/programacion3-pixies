package com.programacion3.pixies.app;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfiguracionActivity extends DrawerActivity {
    TextView cerrar,deseas_cerrar;
    Dialog cerrarDialog;
    Button si, no;
    Intent intent;
    SharedPreferencesController sharedPreferencesController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        sharedPreferencesController = new SharedPreferencesController(this);

        cerrar = (TextView) findViewById(R.id.cerrarSesion);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarDialog = new Dialog(ConfiguracionActivity.this);
                cerrarDialog.setContentView(R.layout.activity_custom_dialog_cerrar);
                deseas_cerrar= (TextView) cerrarDialog.findViewById(R.id.deseas_cerrar_sesion);
                si = (Button) cerrarDialog.findViewById(R.id.si);
                no = (Button) cerrarDialog.findViewById(R.id.no);
                si.setEnabled(true);
                no.setEnabled(true);
                si.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sharedPreferencesController.deleteLoggedUser();
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
                cerrarDialog.show();
            }
        });
    }
}