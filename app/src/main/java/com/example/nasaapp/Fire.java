package com.example.nasaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Fire extends AppCompatActivity {

    private WebView webView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Carga la URL del juego
        webView.loadUrl("https://worldview.earthdata.nasa.gov/?v=-82.7544375,-39.852265625,-34.730999999999995,-18.090546875&e=true&efs=false&efa=true&efd=2023-06-12,2023-10-10&efc=wildfires&l=Reference_Labels_15m(hidden),Reference_Features_15m(hidden),Coastlines_15m,BlueMarble_NextGeneration,VIIRS_NOAA20_CorrectedReflectance_TrueColor(hidden),VIIRS_SNPP_CorrectedReflectance_TrueColor(hidden),MODIS_Aqua_CorrectedReflectance_TrueColor(hidden),MODIS_Terra_CorrectedReflectance_TrueColor&lg=true&s=-55.5435,-30.905&t=2023-10-10-T10%3A32%3A51Z");
    }
}
