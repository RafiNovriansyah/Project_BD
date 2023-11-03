package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {
    Button Bback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Bback = findViewById(R.id.Bback);
        Bback.setOnClickListener(new View.OnClickListener() {
        @Override
         public void onClick(View view) {
         Intent i = new Intent(getApplicationContext(), com.example.myapplication.MainActivity.class);
         startActivity(i);
            }
        });
    }
}