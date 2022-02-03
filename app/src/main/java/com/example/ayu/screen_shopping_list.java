package com.example.ayu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class screen_shopping_list extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_shopping_list);
        imageButton = (ImageButton) findViewById(R.id.buttonEvent);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iEvent = new Intent(screen_shopping_list.this, com.example.ayu.screen_event.class);
                startActivity(iEvent);
            }
        });
        back = (ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(screen_shopping_list.this, Beranda.class);

                startActivity(intent);


            }

        });
    }
}