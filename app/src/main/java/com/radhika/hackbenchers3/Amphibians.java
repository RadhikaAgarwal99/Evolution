package com.radhika.hackbenchers3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Amphibians extends AppCompatActivity {

    Button btnPand, btnElgi, btnHyn, btnIch, btnPed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amphibians);

        btnPand = findViewById(R.id.btnPand);
        btnElgi = findViewById(R.id.btnElgi);
        btnHyn = findViewById(R.id.btnHyn);
        btnIch = findViewById(R.id.btnIch);
        btnPed = findViewById(R.id.btnPed);

        btnPand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Amphibians.this, AmphPand.class);
                startActivity(i);
            }
        });

        btnElgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Amphibians.this, Elginerpeton.class);
                startActivity(i);
            }
        });

        btnHyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Amphibians.this, Hynerpeton.class);
                startActivity(i);
            }
        });

        btnIch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Amphibians.this, Ichthyostega.class);
                startActivity(i);
            }
        });

        btnPed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Amphibians.this, Pederpes.class);
                startActivity(i);
            }
        });
    }
}
