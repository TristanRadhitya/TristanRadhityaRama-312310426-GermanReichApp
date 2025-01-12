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

public class AngkatanlautActivity extends AppCompatActivity {
    ImageButton pindahkemainactivity1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.angkatanlaut);

        pindahkemainactivity1 = findViewById(R.id.btnback2);
        pindahkemainactivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent angkatanlautkemainactivity = new Intent(AngkatanlautActivity.this,menuutama.class);
                startActivity(angkatanlautkemainactivity);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}