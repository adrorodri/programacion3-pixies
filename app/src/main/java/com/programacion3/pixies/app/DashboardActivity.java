package com.programacion3.pixies.app;

import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DashboardActivity extends DrawerActivity {
    ImageView alcancia;
    ImageView alcancia2;
    ImageView alcancia3;
    ImageView alcancia4;
    ImageView alcancia5;
    ImageView alcancia6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        alcancia = findViewById(R.id.alcancia);

        alcancia.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                View layout = getLayoutInflater().inflate(R.layout.activity_custom_dialog, null);
                Button button = layout.findViewById(R.id.comprarCustomDialog);
                button.setText("COMPRAR");
                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setTitle("¿Deseas comprar este producto?");
                builder.setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;
            }

        });
        alcancia2 = findViewById(R.id.alcancia2);

        alcancia2.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                View layout = getLayoutInflater().inflate(R.layout.activity_custom_dialog, null);
                Button button = layout.findViewById(R.id.comprarCustomDialog);
                button.setText("COMPRAR");
                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setTitle("¿Deseas comprar este producto?");
                builder.setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;
            }

        });
        alcancia3 = findViewById(R.id.alcancia3);

        alcancia3.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                View layout = getLayoutInflater().inflate(R.layout.activity_custom_dialog, null);
                Button button = layout.findViewById(R.id.comprarCustomDialog);
                button.setText("COMPRAR");
                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setTitle("¿Deseas comprar este producto?");
                builder.setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;
            }

        });
        alcancia4 = findViewById(R.id.alcancia4);

        alcancia4.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                View layout = getLayoutInflater().inflate(R.layout.activity_custom_dialog, null);
                Button button = layout.findViewById(R.id.comprarCustomDialog);
                button.setText("COMPRAR");
                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setTitle("¿Deseas comprar este producto?");
                builder.setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;
            }

        });
        alcancia5 = findViewById(R.id.alcancia5);

        alcancia5.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                View layout = getLayoutInflater().inflate(R.layout.activity_custom_dialog, null);
                Button button = layout.findViewById(R.id.comprarCustomDialog);
                button.setText("COMPRAR");
                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setTitle("¿Deseas comprar este producto?");
                builder.setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;
            }

        });
        alcancia6 = findViewById(R.id.alcancia6);

        alcancia6.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                View layout = getLayoutInflater().inflate(R.layout.activity_custom_dialog, null);
                Button button = layout.findViewById(R.id.comprarCustomDialog);
                button.setText("COMPRAR");
                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setTitle("¿Deseas comprar este producto?");
                builder.setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;
            }

        });
    }

    @Override
    public void onBackPressed() {

    }
}


