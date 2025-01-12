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

public class WaffenssActivity extends AppCompatActivity {

    ImageButton pindahactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.waffenss);

        pindahactivity = findViewById(R.id.btnback5);
        pindahactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kemenuuutama = new Intent(WaffenssActivity.this,menuutama.class);
                startActivity(kemenuuutama);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}