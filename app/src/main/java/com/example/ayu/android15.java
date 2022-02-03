package com.example.ayu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class android15 extends AppCompatActivity {
    ImageButton bahagia;
    ImageButton back;
    ImageButton tambah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android15);

        bahagia = (ImageButton) findViewById(R.id.bahagia);

        bahagia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android15.this, android39.class);

                startActivity(intent);

            }

        });
        back = (ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android15.this, android18.class);

                startActivity(intent);

            }

        });
        tambah = (ImageButton) findViewById(R.id.tambah);

        tambah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android15.this, android19.class);

                startActivity(intent);

            }

        });
    }
}