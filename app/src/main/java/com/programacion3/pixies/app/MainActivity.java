package com.programacion3.pixies.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;
    String emailValue;
    String passwordValue;
    String[] validEmail = {"pixies@gmail.com"};
    String[] validPassword = {"123456"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
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
                Intent intent = new Intent(this, DashboardActivity.class);
                startActivity(intent);
                return;
            }
        }

        Toast.makeText(this, "Email o contraseña incorrectos!", Toast.LENGTH_SHORT).show();
    }
}
