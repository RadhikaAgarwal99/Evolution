package com.radhika.hackbenchers3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fish extends AppCompatActivity {

    Button btnCam, btnOrd, btnSil, btnPreDev, btnCar, btnPer, btnJur, btnCre, btnCen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        btnCam = findViewById(R.id.btnCam);
        btnOrd = findViewById(R.id.btnOrd);
        btnSil = findViewById(R.id.btnSil);
        btnPreDev = findViewById(R.id.btnPreDev) ;
        btnCar = findViewById(R.id.btnCar);
        btnPer = findViewById(R.id.btnPer);
        btnJur = findViewById(R.id.btnJur);
        btnCre = findViewById(R.id.btnCre);
        btnCen = findViewById(R.id.btnCen);

        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, Cambrian.class);
                startActivity(i);
            }
        });

        btnOrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, Ordovician.class);
                startActivity(i);
            }
        });

        btnSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, Silurian.class);
                startActivity(i);
            }
        });

        btnPreDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, PreDevonian.class);
                startActivity(i);
            }
        });

        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, FishCarboniferous.class);
                startActivity(i);
            }
        });

        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, FishPermian.class);
                startActivity(i);
            }
        });

        btnJur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, FishJurassic.class);
                startActivity(i);
            }
        });

        btnCre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, FishCretaceous.class);
                startActivity(i);
            }
        });

        btnCen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fish.this, CenzoicEra.class);
                startActivity(i);
            }
        });
    }
}
