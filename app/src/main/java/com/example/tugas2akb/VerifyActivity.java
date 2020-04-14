package com.example.tugas2akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    NIM                 : 10118705
    Nama                : Dirza Aulia
    Kelas               : IF-6K
    Tanggal Pengerjaan  : 11 April 2020
    Deskripsi Pekerjaan : Membuat halaman keempat aplikasi yaitu halaman Verify secara desain dan pemrogramannya.
 */

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Button buttonSendCode = findViewById(R.id.button_send_code);

        Intent intent = getIntent();
        final String username = intent.getStringExtra("username");
        final String bloodType = intent.getStringExtra("blood_type");

        buttonSendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HomeActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("blood_type", bloodType);
                startActivity(intent);
            }
        });
    }
}
