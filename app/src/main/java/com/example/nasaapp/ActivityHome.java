package com.example.nasaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnCerrarSesion = findViewById(R.id.button);
        ImageView imageViewLogo9 = findViewById(R.id.imageViewLogo9);

        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageViewLogo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, Guides.class);
                startActivity(intent);
            }
        });


        ImageView imageViewLogo7 = findViewById(R.id.imageViewLogo7);
        imageViewLogo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, Weather.class);
                startActivity(intent);
            }
        });

        ImageView imageViewLogo = findViewById(R.id.imageViewLogo);
        imageViewLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, Fire.class);
                startActivity(intent);
            }
        });
        ImageView imageViewLogo10 = findViewById(R.id.imageViewLogo10);
        imageViewLogo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, Games.class);
                startActivity(intent);
            }
        });

        ImageView imageViewLogo8 = findViewById(R.id.imageViewLogo8);
        imageViewLogo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, News.class);
                startActivity(intent);
            }
        });

        ImageView imageViewLogo11 = findViewById(R.id.imageViewLogo11);
        imageViewLogo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, Settings.class);
                startActivity(intent);
            }
        });
    }
}
