package com.programacion3.pixies.app.UI.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.programacion3.pixies.app.R;

public class RegisterActivity extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextContrasena;
    EditText editTextDireccion;
    EditText editTextNombreCompleto;
    EditText editTextNumeroTelefono;

    String newEmail;
    String newContrasena;
    String newDireccion;
    String newNombreCompleto;
    String newNumeroTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextEmail = (EditText) findViewById(R.id.email);
        editTextContrasena = (EditText) findViewById(R.id.contrasena);
        editTextDireccion = (EditText) findViewById(R.id.direccion);
        editTextNombreCompleto = (EditText) findViewById(R.id.nombrecompleto);
        editTextNumeroTelefono = (EditText) findViewById(R.id.numerotelefono);
        Button btnRegister  = (Button) findViewById(R.id.registrarse2);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                newEmail = String.valueOf(editTextEmail.getText());
                newContrasena = String.valueOf(editTextContrasena.getText().toString());
                newDireccion = String.valueOf(editTextDireccion.getText().toString());
                newNombreCompleto = String.valueOf(editTextNombreCompleto.getText().toString());
                newNumeroTelefono = String.valueOf(editTextNumeroTelefono.getText().toString());

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(newEmail + newContrasena + "data", newEmail + "/n"
                        + newNombreCompleto + newNumeroTelefono + newDireccion) ;
                editor.commit();

                Intent loginScreen = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(loginScreen);
            }
        });

    }
}


