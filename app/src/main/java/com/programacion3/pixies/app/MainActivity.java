package com.programacion3.pixies.app;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;
    String emailValue;
    String passwordValue;
    String[] validEmail ={"pixies@gmail.com"};
    String[] validPassword={"123456"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);

//        final EditText etEmail  = (EditText) findViewById(R.id.editTextEmail);
//        final EditText etPassword = (EditText) findViewById(R.id.editTextPassword);
//        Button btnLogin = (Button) findViewById(R.id.entrar);
//        Button btnRegister = (Button) findViewById(R.id.registrarse);
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String Email = etEmail.getText().toString();
//                String Contrasena = etPassword.getText().toString();
//
//                SharedPreferences preferences = getPreferences("MYPREFS", MODE_PRIVATE);
//
//                String emailDetalles = preferences.getString(Email + Contrasena + "data", "Email o Contrasena es incorrecto.");
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.commit();
//
//                Intent mainact = new Intent(MainActivity.this, BienvenidosActivity.class );
//                startActivity(mainact);
//            }
//        });
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent registerAct = new Intent(MainActivity.this, RegisterActivity.class);
//                startActivity(registerAct);
//            }
//        });
}
    @Override
    public void onBackPressed() {

    }

    public void clickButton(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.entrar:{
                login(view);
                break;
            }
            case R.id.registrarse:{
                intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;
            }

        }

    }

    public void login(View view) {
        emailValue = String.valueOf(editTextEmail.getText());
        passwordValue = String.valueOf(editTextPassword.getText());

        for(int i = 0; i < validEmail.length ; i++) {
            if (emailValue.equals(validEmail[i]) && passwordValue.equals(validPassword[i])) {
                Intent intent = new Intent(this, BienvenidosActivity.class);
                startActivity(intent);
                return;
            }
        }

        Toast.makeText(this, "Email o contraseña incorrectos!", Toast.LENGTH_SHORT).show();
    }
}
