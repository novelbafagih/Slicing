package com.example.slicing;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    protected EditText email, password;
    protected Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keyEmail = "novel@gmail.com";
                String keyPassword = "205150700111016";
                Intent intent = new Intent(MainActivity.this, MrHeadActivity.class);
                startActivity(intent);

                if(keyEmail.equals(email.getText().toString()) && keyPassword.equals(password.getText().toString()) ){
                    Toast.makeText(MainActivity.this, "Username & Password Benar", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Username & Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

