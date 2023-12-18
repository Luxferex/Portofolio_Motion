package com.example.portofoliologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;

    private String username = "Georgio Armando Woda Kolo";
    private String password = "AminLulusMotionLab";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etUsername.getText().toString().equalsIgnoreCase(username) && etPassword.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(MainActivity.this, Dashboard.class);
                    startActivities(login);

                    Toast.makeText(MainActivity.this, "LOGIN BERHASIL!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Username atau Password yang anda masukkan salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}