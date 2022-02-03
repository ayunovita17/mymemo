package com.example.ayu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class screen_all extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton tambah;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_all);
        imageButton = (ImageButton) findViewById(R.id.buttonPersonal);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPersonal = new Intent(screen_all.this, com.example.ayu.screen_personal.class);
                startActivity(iPersonal);
            }
        });
        tambah = (ImageButton) findViewById(R.id.tambah);

        tambah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(screen_all.this, MainActivity.class);

                startActivity(intent);


            }

        });
        back = (ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(screen_all.this, Beranda.class);

                startActivity(intent);


            }

        });
    }
}