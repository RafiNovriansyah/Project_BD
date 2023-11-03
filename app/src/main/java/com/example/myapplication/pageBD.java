package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.myapplication.R;

public class pageBD extends AppCompatActivity {
    ImageButton Belahketupat, Hexagon, Layang2, jajarG;
    Button Bback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_bd);
        Belahketupat = findViewById(R.id.Bbk);
        Hexagon = findViewById(R.id.imageButton1);
        Layang2 = findViewById(R.id.imageButton3);
        jajarG = findViewById(R.id.imageButton2);
        Bback = findViewById(R.id.Bloop);
        Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.MainActivity.class);
                startActivity(i);
            }
        });

        Belahketupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.belahketupat.class);
                startActivity(i);
            }
        });

        Hexagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.hexagon.class);
                startActivity(i);
            }
        });

        Layang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.layang2.class);
                startActivity(i);
            }
        });

        jajarG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.jjg.class);
                startActivity(i);
            }
        });
    }
}