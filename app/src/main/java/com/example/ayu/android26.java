package com.example.ayu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class android26 extends AppCompatActivity {
    ImageButton btl;
    ImageButton sls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android26);

        btl = (ImageButton) findViewById(R.id.btl);
        sls = (ImageButton) findViewById(R.id.sls);

        btl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android26.this, attachment.class);

                startActivity(intent);

            }

        });
        sls.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android26.this, android32.class);

                startActivity(intent);

            }

        });
    }
}