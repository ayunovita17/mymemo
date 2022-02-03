package com.example.ayu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class android18 extends AppCompatActivity {
    ImageButton sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android18);

        sv = (ImageButton) findViewById(R.id.sv);

        sv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android18.this, android15.class);

                startActivity(intent);

            }

        });
    }
}