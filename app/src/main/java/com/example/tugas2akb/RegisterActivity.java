package com.example.tugas2akb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

/*
    NIM                 : 10118705
    Nama                : Dirza Aulia
    Kelas               : IF-6K
    Tanggal Pengerjaan  : 11 April 2020
    Deskripsi Pekerjaan : Membuat halaman kedua aplikasi yaitu halaman Register secara desain dan pemrogramannya.
 */

public class RegisterActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText editTextUsername;
    AutoCompleteTextView editTextBloodType;
    CheckBox checkBoxAgree;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        toolbar = findViewById(R.id.toolbar);
        editTextUsername = findViewById(R.id.edit_text_username_register);
        editTextBloodType = findViewById(R.id.auto_edit_text_bloodtype);
        checkBoxAgree = findViewById(R.id.checkbox_agree);
        buttonRegister = findViewById(R.id.button_register);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Register");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String bloodType = editTextBloodType.getText().toString();

                if (username.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Username can't be empty!", Toast.LENGTH_SHORT).show();
                } else if(bloodType.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Blood type can't be empty!", Toast.LENGTH_SHORT).show();
                } else if (!checkBoxAgree.isChecked()) {
                    Toast.makeText(getBaseContext(), "You must agree with the Terms and Condition!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getBaseContext(), AlmostActivity.class);
                    intent.putExtra("username", username);
                    intent.putExtra("blood_type", bloodType);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(this, MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}