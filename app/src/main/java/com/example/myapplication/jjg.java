package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class jjg extends AppCompatActivity {
    Button BtnKeliling, BtnLuas, BtnHitung, BBack;
    TextView hasil, keliling, luas;
    EditText tinggi, sisiA, sisiB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jjg);
        BBack = findViewById(R.id.Back);
        keliling = findViewById(R.id.keliling);
        luas = findViewById(R.id.luas);
        tinggi = findViewById(R.id.tinggi);
        sisiA = findViewById(R.id.sisiA);
        sisiB = findViewById(R.id.sisiB);
        hasil = findViewById(R.id.hasil);
        BtnLuas = findViewById(R.id.Bluas);
        BtnKeliling = findViewById(R.id.Bkeliling);
        BtnHitung = findViewById(R.id.Bhitung);

        BBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), pageBD.class);
                startActivity(i);
            }
        });

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hitung;
                try {
                    if (tinggi.getVisibility() == View.VISIBLE) {
                        if (!tinggi.getText().toString().isEmpty() && !sisiA.getText().toString().isEmpty()) {
                            Double T = Double.parseDouble(tinggi.getText().toString());
                            Double A = Double.parseDouble(sisiA.getText().toString());
                            hitung = T * A; // Rumus luas layang"
                            hasil.setText(String.valueOf(hitung));
                        } else {
                            hasil.setText("Mohon isi tinggi Dan sisi A.");
                        }
                    } else if (sisiB.getVisibility() == View.VISIBLE) {
                        if (!sisiB.getText().toString().isEmpty()) {
                            int A = Integer.parseInt(sisiA.getText().toString());
                            int B = Integer.parseInt(sisiB.getText().toString());
                            hitung = 2 * (A + B); // Rumus keliling belah layang"
                            hasil.setText(String.valueOf(hitung));
                        } else {
                            hasil.setText("Mohon isi sisi A dan sisi B.");
                        }
                    } else {
                        hasil.setText("Pilih perhitungan terlebih dahulu (Luas/Keliling).");
                    }
                } catch (NumberFormatException e) {
                    hasil.setText("Input tidak valid. Masukkan angka yang benar.");
                }
            }
        });


        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisiA.setText("");
                sisiB.setText("");
                tinggi.setText("");
                hasil.setText("");
                sisiA.setVisibility(View.VISIBLE);
                sisiB.setVisibility(View.GONE);
                tinggi.setVisibility(View.VISIBLE);
                keliling.setVisibility(View.GONE);
                luas.setVisibility(View.VISIBLE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisiA.setText("");
                sisiB.setText("");
                tinggi.setText("");
                hasil.setText("");
                sisiA.setVisibility(View.VISIBLE);
                sisiB.setVisibility(View.VISIBLE);
                tinggi.setVisibility(View.GONE);
                keliling.setVisibility(View.VISIBLE);
                luas.setVisibility(View.GONE);
            }
        });
    }
}

