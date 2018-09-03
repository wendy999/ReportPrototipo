package com.example.anyta.reportprototipo.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.anyta.reportprototipo.LoguinActivity;
import com.example.anyta.reportprototipo.R;

public class PortadaActivity extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);
        int imagenes[] = {R.drawable.libro,R.drawable.sala_clase,R.drawable.grupo,R.drawable.image4651};

        v_flipper = findViewById(R.id.v_flipper);

        for (int image:imagenes)
        {
            flipperImages(image);
        }
    }

    public  void flipperImages(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(8000);
        v_flipper.setAutoStart(true);
    }

    public void IngrasarCuenta(View view)
    {
        Intent intent = new Intent(PortadaActivity.this,LoguinActivity.class);
        startActivity(intent);
        finish();
    }
}