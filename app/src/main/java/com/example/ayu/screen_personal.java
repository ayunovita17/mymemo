package com.example.ayu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class screen_personal extends AppCompatActivity {
ImageButton imageButton;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_personal);
        imageButton = (ImageButton) findViewById(R.id.buttonShop);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iShop = new Intent(screen_personal.this, screen_shopping_list.class);
                startActivity(iShop);
            }
        });
        back = (ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(screen_personal.this, Beranda.class);

                startActivity(intent);


            }

        });

    }
}