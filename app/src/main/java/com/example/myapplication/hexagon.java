package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hexagon extends AppCompatActivity {
    Button BtnKeliling, BtnLuas, BtnHitung, BBack;
    TextView hasil, keliling, luas;
    EditText tinggi, sisi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagon);
        BBack = findViewById(R.id.Back);
        keliling = findViewById(R.id.keliling);
        luas = findViewById(R.id.luas);
        tinggi = findViewById(R.id.tinggi);
        sisi = findViewById(R.id.sisiA);
        hasil = findViewById(R.id.hasil);
        BtnLuas = findViewById(R.id.Bluas);
        BtnKeliling = findViewById(R.id.Bkeliling);
        BtnHitung = findViewById(R.id.Bhitung);

        BBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication.pageBD.class);
                startActivity(i);
            }
        });

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hitung;
                if (sisi.getVisibility() == View.VISIBLE) {
                    if (!sisi.getText().toString().isEmpty()) {
                        int a = Integer.parseInt(sisi.getText().toString());

                        if (tinggi.getVisibility() == View.VISIBLE) {
                            if (!tinggi.getText().toString().isEmpty()) {
                                int d = Integer.parseInt(tinggi.getText().toString());
                                hitung = 1.5 * a * d; // Rumus luas heksagon
                                hasil.setText(String.valueOf(hitung));
                            } else {
                                hasil.setText("Mohon isi tinggi.");
                            }
                        } else {
                            hitung = 6 * a; // Rumus keliling heksagon
                            hasil.setText(String.valueOf(hitung));
                        }
                    } else {
                        hasil.setText("Mohon isi Nilai.");
                    }
                } else {
                    hasil.setText("Pilih perhitungan terlebih dahulu (Luas/Keliling).");
                }
            }
        });


        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi.setText("");
                tinggi.setText("");
                hasil.setText("");
                tinggi.setVisibility(View.VISIBLE);
                sisi.setVisibility(View.VISIBLE);
                keliling.setVisibility(View.GONE);
                luas.setVisibility(View.VISIBLE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi.setText("");
                tinggi.setText("");
                hasil.setText("");
                tinggi.setVisibility(View.GONE);
                sisi.setVisibility(View.VISIBLE);
                keliling.setVisibility(View.VISIBLE);
                luas.setVisibility(View.GONE);
            }
        });



    }
}