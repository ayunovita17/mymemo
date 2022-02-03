package com.example.ayu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class screen_event extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_event);
        imageButton = (ImageButton) findViewById(R.id.buttonSport);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSport = new Intent(screen_event.this, com.example.ayu.screen_sport.class);
                startActivity(iSport);
            }
        });
        back = (ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(screen_event.this, Beranda.class);

                startActivity(intent);


            }

        });
    }
}