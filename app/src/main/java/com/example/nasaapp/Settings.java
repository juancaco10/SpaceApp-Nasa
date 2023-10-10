package com.example.nasaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    private WebView webView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);}}