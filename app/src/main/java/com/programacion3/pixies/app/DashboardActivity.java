package com.programacion3.pixies.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DashboardActivity extends DrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
}