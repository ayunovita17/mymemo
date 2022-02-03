package com.example.ayu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class attachment extends AppCompatActivity {
    ImageButton cancel;
    ImageButton save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attachment);

        cancel = (ImageButton) findViewById(R.id.cancel);
        save = (ImageButton) findViewById(R.id.imageBtnSave);


        cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(attachment.this, MainActivity.class);

                startActivity(intent);

            }

        });

        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(attachment.this, android26.class);

                startActivity(intent);

            }

        });
    }
}