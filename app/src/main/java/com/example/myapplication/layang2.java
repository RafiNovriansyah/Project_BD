package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class layang2 extends AppCompatActivity {
    Button BtnKeliling, BtnLuas, BtnHitung, BBack;
    TextView hasil,luas , keliling;
    EditText D1, D2, sisi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang2);
        BBack = findViewById(R.id.Back);
        keliling = findViewById(R.id.keliling);
        luas = findViewById(R.id.luas);
        D1 = findViewById(R.id.D1);
        D2 = findViewById(R.id.D2);
        sisi = findViewById(R.id.sisi);
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
                try {
                    if (D2.getVisibility() == View.VISIBLE) {
                        if (!D1.getText().toString().isEmpty() && !D2.getText().toString().isEmpty()) {
                            Double d1 = Double.parseDouble(D1.getText().toString());
                            Double d2 = Double.parseDouble(D2.getText().toString());
                            hitung = d1 * d2 / 2; // Rumus luas layang"
                            hasil.setText(String.valueOf(hitung));
                        } else {
                            hasil.setText("Mohon isi kedua diagonal.");
                        }
                    } else if (sisi.getVisibility() == View.VISIBLE) {
                        if (!sisi.getText().toString().isEmpty()) {
                            int s = Integer.parseInt(sisi.getText().toString());
                            hitung = 4 * s; // Rumus keliling belah layang"
                            hasil.setText(String.valueOf(hitung));
                        } else {
                            hasil.setText("Mohon isi sisi.");
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
                sisi.setText("");
                D1.setText("");
                D2.setText("");
                hasil.setText("");
                D1.setVisibility(View.VISIBLE);
                D2.setVisibility(View.VISIBLE);
                sisi.setVisibility(View.GONE);
                keliling.setVisibility(View.GONE);
                luas.setVisibility(View.VISIBLE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi.setText("");
                D1.setText("");
                hasil.setText("");
                D1.setVisibility(View.GONE);
                D2.setVisibility(View.GONE);
                sisi.setVisibility(View.VISIBLE);
                keliling.setVisibility(View.VISIBLE);
                luas.setVisibility(View.GONE);
            }
        });



    }
}