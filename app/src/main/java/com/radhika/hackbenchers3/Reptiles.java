package com.radhika.hackbenchers3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reptiles extends AppCompatActivity {

    Button btnTer, btnCre, btnJur, btnTri, btnPer, btnCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptiles);

        btnTer = findViewById(R.id.btnTer);
        btnCre = findViewById(R.id.btnCre);
        btnJur = findViewById(R.id.btnJur);
        btnTri = findViewById(R.id.btnTri);
        btnPer = findViewById(R.id.btnPer);
        btnCar = findViewById(R.id.btnCar);

        btnTer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Reptiles.this, Tertiary.class);
                startActivity(i);
            }
        });

        btnCre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Reptiles.this, RepCretaceous.class);
                startActivity(i);
            }
        });

        btnJur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Reptiles.this, RepJurassic.class);
                startActivity(i);
            }
        });

        btnTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Reptiles.this, RepTriassic.class);
                startActivity(i);
            }
        });

        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Reptiles.this, Permian.class);
                startActivity(i);
            }
        });

        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Reptiles.this, Carboniferous.class);
                startActivity(i);
            }
        });
    }
}
