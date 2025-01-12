package com.example.germanreichapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AngkatanudaraActivity extends AppCompatActivity {
    ImageButton pindahkemenuutama2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.angkatanudara);

        pindahkemenuutama2 = findViewById(R.id.btnback3);
        pindahkemenuutama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kemenuutama2 = new Intent(AngkatanudaraActivity.this,menuutama.class);
                startActivity(kemenuutama2);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}