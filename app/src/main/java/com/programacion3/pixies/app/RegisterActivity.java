package com.programacion3.pixies.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextContrasena;
    EditText editTextDireccion;
    EditText editTextNombreCompleto;
    EditText editTextNumeroTelefono;

    String emailValue;
    String contrasenaValue;
    String direccionValue;
    String nombreCompletoValue;
    String numeroTelefonoValue;
    String[] validEmail = {"pixies@gmail.com"};
    String[] validContrasena = {"123456"};
    String[] validDireccion = {"UPB"};
    String[] validNombreCompleto = {"Pixies"};
    String[] validNumeroTelefono = {"79540265"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextEmail = findViewById(R.id.email);
        editTextContrasena = findViewById(R.id.contrasena);
        editTextDireccion = findViewById(R.id.direccion);
        editTextNombreCompleto = findViewById(R.id.nombrecompleto);
        editTextNumeroTelefono = findViewById(R.id.numerotelefono);
    }
    public void clickButton(View view) {
        registrarse(view);
    }
    public void registrarse(View view) {
        // Get the new values from the Edit Text
        emailValue = String.valueOf(editTextEmail.getText());
        contrasenaValue = String.valueOf(editTextContrasena.getText());
        numeroTelefonoValue = String.valueOf(editTextNumeroTelefono.getText());
        direccionValue = String.valueOf(editTextDireccion.getText());
        nombreCompletoValue = String.valueOf(editTextNombreCompleto.getText());

        for(int i = 0; i < validEmail.length ; i++) {
            if (emailValue.equals(validEmail[i]) && contrasenaValue.equals(validContrasena[i])
                    &&direccionValue.equals(validDireccion[i])&&numeroTelefonoValue.equals(validNumeroTelefono[i])
                    &&nombreCompletoValue.equals(validNombreCompleto[i])) {
                // Open new Activity (SecondActivity.class)
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return;
            }
        }

        Toast.makeText(this, "Datos invalidos!", Toast.LENGTH_SHORT).show();
    }

}
