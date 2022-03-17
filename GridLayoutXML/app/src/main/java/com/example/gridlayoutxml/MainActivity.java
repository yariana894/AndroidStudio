package com.example.gridlayoutxml;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    GridLayout g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g = findViewById(R.id.gridLayout1);
        Recorrer();
    }

    public void Recorrer() {
        int numeroBotones = 9;

        for (int i = 0; i < numeroBotones; i++) {
            button = new Button(this);
            //proporciona un id a cada boton
            button.setId(View.generateViewId());
            button.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setText("Botón: " + i);
            g.addView(button, i);
        }
    }
}