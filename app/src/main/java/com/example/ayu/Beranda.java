package com.example.ayu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Beranda extends AppCompatActivity {

    ImageButton diary;
    ImageButton task;
    ImageButton reminder;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        diary = (ImageButton) findViewById(R.id.diary);

        diary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Beranda.this, android19.class);

                startActivity(intent);


            }

        });
        task = (ImageButton) findViewById(R.id.task);

        task.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Beranda.this, screen_all.class);

                startActivity(intent);


            }

        });
        reminder = (ImageButton) findViewById(R.id.reminder);

        reminder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Beranda.this, sleepReminder.class);

                startActivity(intent);


            }

        });


    }
}