package com.radhika.hackbenchers3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreMammals extends AppCompatActivity {

    Button btnPreTri, btnPreCre, btnPreJur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_mammals);

        btnPreTri = findViewById(R.id.btnPreTri2);
        btnPreCre = findViewById(R.id.btnPreCre);
        btnPreJur = findViewById(R.id.btnPreJur);

        btnPreTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PreMammals.this, PreTriassic.class);
                startActivity(i);
            }
        });

        btnPreCre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PreMammals.this, PreCretaceous.class);
                startActivity(i);
            }
        });

        btnPreJur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PreMammals.this, PreJurassic.class);
                startActivity(i);
            }
        });
    }
}
