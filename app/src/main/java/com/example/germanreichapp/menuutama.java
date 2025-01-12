package com.example.germanreichapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menuutama extends AppCompatActivity {
    ImageButton pindahactivity1;
    ImageButton pindahactivity2;
    ImageButton pindahactivity3;
    ImageButton pindahactivity4;
    ImageButton pindahactivity5;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menuutama);

        pindahactivity1 = findViewById(R.id.btnback);
        pindahactivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahkemainactivity = new Intent(menuutama.this,MainActivity.class);
                startActivity(pindahkemainactivity);
            }
        });

        pindahactivity2 = findViewById(R.id.btn1);
        pindahactivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahkeangkatanlaut = new Intent(menuutama.this,AngkatanlautActivity.class);
                startActivity(pindahkeangkatanlaut);
            }
        });

        pindahactivity3 = findViewById(R.id.btnangkatanudara);
        pindahactivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent keangkatanudara = new Intent(menuutama.this,AngkatanudaraActivity.class);
                startActivity(keangkatanudara);
            }
        });

        pindahactivity4 = findViewById(R.id.btnangkatandarat);
        pindahactivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent keangkatandarat = new Intent(menuutama.this,AngkatandaratActivity.class);
                startActivity(keangkatandarat);
            }
        });

        pindahactivity5 = findViewById(R.id.btnwaffenss);
        pindahactivity5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kewaffenss = new Intent(menuutama.this,WaffenssActivity.class);
                startActivity(kewaffenss);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}