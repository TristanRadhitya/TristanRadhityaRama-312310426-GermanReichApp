package com.example.germanreichapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AngkatandaratActivity extends AppCompatActivity {
    ImageButton pindahkemenuutama1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.angkatandarat);

        pindahkemenuutama1 = findViewById(R.id.btnback4);
        pindahkemenuutama1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kemenuutama = new Intent(AngkatandaratActivity.this,menuutama.class);
                startActivity(kemenuutama);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}