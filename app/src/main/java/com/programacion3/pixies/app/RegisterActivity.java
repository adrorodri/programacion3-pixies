package com.programacion3.pixies.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    String emailValue;
    String contrasenaValue;
    String direccionValue;
    String nombreCompletoValue;
    String numeroTelefonoValue;
//    String[] validEmail = {"pixies@gmail.com"};
//    String[] validContrasena = {"123456"};
//    String[] validDireccion = {"UPB"};
//    String[] validNombreCompleto = {"Pixies"};
//    String[] validNumeroTelefono = {"79540265"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText email = (EditText) findViewById(R.id.email);
        final EditText contrasena = (EditText) findViewById(R.id.contrasena);
        final EditText direccion = (EditText) findViewById(R.id.direccion);
        final EditText nombreCompleto = (EditText) findViewById(R.id.nombrecompleto);
        final EditText numeroTelefono = (EditText) findViewById(R.id.numerotelefono);
        Button btnRegister  = (Button) findViewById(R.id.registrarse2);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                newEmail = editTextEmail.getText().toString();
                newContrasena = editTextContrasena.getText().toString();
                newDireccion = editTextDireccion.getText().toString();
                newNombreCompleto = editTextNombreCompleto.getText().toString();
                newNumeroTelefono = editTextNumeroTelefono.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(newEmail + newContrasena + "data", newEmail + "/n"
                        + newNombreCompleto + newNumeroTelefono + newDireccion) ;
                editor.commit();

                Intent loginScreen = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(loginScreen);
            }
        });

    }

//    public void clickButton(View view) {
//        registrarse(view);
//
//    }
//    public void registrarse(View view) {
//        emailValue = String.valueOf(editTextEmail.getText());
//        contrasenaValue = String.valueOf(editTextContrasena.getText());
//        numeroTelefonoValue = String.valueOf(editTextNumeroTelefono.getText());
//        direccionValue = String.valueOf(editTextDireccion.getText());
//        nombreCompletoValue = String.valueOf(editTextNombreCompleto.getText());
//
//        for(int i = 0; i < validEmail.length ; i++) {
//            if (emailValue.equals(validEmail[i]) && contrasenaValue.equals(validContrasena[i])
//                    &&direccionValue.equals(validDireccion[i])&&numeroTelefonoValue.equals(validNumeroTelefono[i])
//                    &&nombreCompletoValue.equals(validNombreCompleto[i])) {
//                Intent intent = new Intent(this, MainActivity.class);
//                startActivity(intent);
//                return;
//            }
//        }
//
//        Toast.makeText(this, "Datos invalidos!", Toast.LENGTH_SHORT).show();
    }


