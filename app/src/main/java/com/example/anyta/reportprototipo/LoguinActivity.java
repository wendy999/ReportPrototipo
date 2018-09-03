package com.example.anyta.reportprototipo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LoguinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);
    }

    public void onClick(View view)
    {
        Intent intent = new Intent(LoguinActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void CrearCuenta(View view)
    {

    }
}

