package com.programacion3.pixies.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    }


    public void clickButton(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.entrar:{
                intent = new Intent(this, PerfilActivity.class);
                break;
            }
            default: {
                intent = new Intent(this, MainActivity.class);
                break;
            }
        }

        startActivity(intent);
    }
}
