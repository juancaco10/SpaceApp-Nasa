package com.example.nasaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextText3;
    private EditText editTextText4;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText3 = findViewById(R.id.editTextText3);
        editTextText4 = findViewById(R.id.editTextText4);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener el correo y la contraseña ingresados por el usuario
                String email = editTextText3.getText().toString().trim();
                String password = editTextText4.getText().toString().trim();

                // Verificar que los datos de inicio de sesión sean los correctos
                if (email.equals("correo@hotmail.com") && password.equals("1234567")) {
                    // Datos de inicio de sesión correctos, abrir la actividad ActivityHome
                    Intent intent = new Intent(LoginActivity.this, ActivityHome.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Datos de inicio de sesión incorrectos, mostrar un mensaje de error
                    Toast.makeText(LoginActivity.this, "Correo o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
