package com.example.tugas2akb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/*
    NIM                 : 10118705
    Nama                : Dirza Aulia
    Kelas               : IF-6K
    Tanggal Pengerjaan  : 11 April 2020
    Deskripsi Pekerjaan : Membuat halaman pertama aplikasi yaitu halaman Login secara desain dan pemrogramannya.
 */

public class MainActivity extends AppCompatActivity {

    TextView textViewRegister;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRegister = findViewById(R.id.text_view_register);

        textViewRegister.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(getBaseContext(), RegisterActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }
}
