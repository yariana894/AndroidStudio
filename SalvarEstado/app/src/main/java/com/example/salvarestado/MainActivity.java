package com.example.salvarestado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final String EXTRA_ENTERO = "EXTRA_ENTERO";
    static final String EXTRA_ENTERO_DOS = "EXTRA_ENTERO_DOS";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickContador(View view) {
        miContador++;
        ((TextView) findViewById(R.id.textViewCounter)).setText("Contador: " + Integer.toString(miContador));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //guaradamos la info que nos intereese
        outState.putInt(KEY_COUNTER, miContador);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //recuperamos la info guardada
        miContador = savedInstanceState.getInt(KEY_COUNTER);
    }
}