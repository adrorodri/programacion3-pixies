package com.programacion3.pixies.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrawerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);
    }
    public void clickDrawer(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.entrarAlPerfil:{
                intent = new Intent(this, PerfilActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.productos:{
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            }

        }


    }

}