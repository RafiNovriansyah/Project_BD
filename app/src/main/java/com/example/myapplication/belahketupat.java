package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class belahketupat extends AppCompatActivity {
    Button BLuas, Bkeliling, BHitung, Bback;
    TextView TVhasil, keliling, luas;
    EditText D1, D2, Sisi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belahketupat); // Ganti layout yang sesuai
        keliling = findViewById(R.id.keliling);
        luas = findViewById(R.id.luas);
        D1 = findViewById(R.id.diagonal1);
        D2 = findViewById(R.id.diagonal2);
        Sisi = findViewById(R.id.sisi);
        TVhasil = findViewById(R.id.hasil);
        BLuas = findViewById(R.id.Bluas);
        Bkeliling = findViewById(R.id.Bkeliling);
        Bback = findViewById(R.id.Back); // Pastikan ID-nya sesuai
        BHitung = findViewById(R.id.Bhitung);

        Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), pageBD.class);
                startActivity(i);
            }
        });

        BHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hitung;
                try {
                    if (D2.getVisibility() == View.VISIBLE) {
                        if (!D1.getText().toString().isEmpty() && !D2.getText().toString().isEmpty()) {
                            int d1 = Integer.parseInt(D1.getText().toString());
                            int d2 = Integer.parseInt(D2.getText().toString());
                            hitung = 0.5 * d1 * d2; // Rumus luas belah ketupat
                            TVhasil.setText(String.valueOf(hitung));
                        } else {
                            TVhasil.setText("Mohon isi kedua diagonal.");
                        }
                    } else if (Sisi.getVisibility() == View.VISIBLE) {
                        if (!Sisi.getText().toString().isEmpty()) {
                            int s = Integer.parseInt(Sisi.getText().toString());
                            hitung = 4 * s; // Rumus keliling belah ketupat
                            TVhasil.setText(String.valueOf(hitung));
                        } else {
                            TVhasil.setText("Mohon isi sisi.");
                        }
                    } else {
                        TVhasil.setText("Pilih perhitungan terlebih dahulu (Luas/Keliling).");
                    }
                } catch (NumberFormatException e) {
                    TVhasil.setText("Input tidak valid. Masukkan angka yang benar.");
                }
            }
        });


        BLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D2.setText("");
                Sisi.setText("");
                D1.setText("");
                TVhasil.setText("");
                D1.setVisibility(View.VISIBLE);
                D2.setVisibility(View.VISIBLE);
                Sisi.setVisibility(View.GONE);
                keliling.setVisibility(View.GONE);
                luas.setVisibility(View.VISIBLE);
            }
        });

        Bkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D2.setText("");
                Sisi.setText("");
                D1.setText("");
                TVhasil.setText("");
                D1.setVisibility(View.GONE);
                D2.setVisibility(View.GONE);
                Sisi.setVisibility(View.VISIBLE);
                keliling.setVisibility(View.VISIBLE);
                luas.setVisibility(View.GONE);
            }
        });
    }
}
