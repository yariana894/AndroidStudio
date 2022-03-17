package com.example.tirandodewidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirWeb (View view) {
        String url = "https://github.com/mrtnmmn";
        WebView wv = (WebView) findViewById(R.id.webView);

        final WebSettings ajustesVisorWEb = wv.getSettings();
        ajustesVisorWEb.setJavaScriptEnabled(true);
        //problema al cargar
        wv.loadUrl(url);
    }
}