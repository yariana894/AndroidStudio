package com.example.inflandolayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickIzquierda(View view) {

        setContentView(R.layout.activity_main_dos);

        Toast.makeText(this, "Vista Izquierda", Toast.LENGTH_SHORT).show();


    }

    public void onClickDerecha(View view) {
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Vista Derecha", Toast.LENGTH_SHORT).show();

    }

    public void onClickTerminar(View view) {
        finish();
    }

    public void irTerminar(View view) {
        findViewById(R.id.terminar);
        setContentView(R.layout.activity_main_final);
    }
}