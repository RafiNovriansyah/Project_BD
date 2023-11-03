package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    Button BLuas, Bkeliling, Babout, Bback;
    TextView TVhasil;
    EditText D1, D2, Sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Babout = findViewById(R.id.Babout);
        Bback = findViewById(R.id.Bbd);
        Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.pageBD.class);
                startActivity(i);
            }
        });

        Babout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.About.class);
                startActivity(i);
            }
        });

    }
}