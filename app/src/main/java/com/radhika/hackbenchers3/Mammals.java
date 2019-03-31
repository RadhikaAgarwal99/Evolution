package com.radhika.hackbenchers3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mammals extends AppCompatActivity {

    Button btntri, btnjur, btncre, btnpal, btneoc, btnoli, btnmio, btnpil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mammals);

        btntri = findViewById(R.id.btntri);
        btnjur = findViewById(R.id.btnjur);
        btncre = findViewById(R.id.btncre);
        btnpal = findViewById(R.id.btnpal);
        btneoc = findViewById(R.id.btneoc);
        btnoli = findViewById(R.id.btnoli);
        btnmio = findViewById(R.id.btnmio);
        btnpil = findViewById(R.id.btnpil);

        btntri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, Triassic.class);
                startActivity(i);
            }
        });

        btnjur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, Jurrasic.class);
                startActivity(i);
            }
        });

        btncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, Cretaceous.class);
                startActivity(i);
            }
        });

        btnpal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, Paleocene.class);
                startActivity(i);
            }
        });

        btneoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, EOCENE.class);
                startActivity(i);
            }
        });

        btnoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, Oligocene.class);
                startActivity(i);
            }
        });

        btnmio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, Miocene.class);
                startActivity(i);
            }
        });

        btnpil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mammals.this, Pilocene.class);
                startActivity(i);
            }
        });
    }
}
