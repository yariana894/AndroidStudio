package com.example.ej1a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    TextView txt1;
    TextView txt2;

    public static int pies;
    public static int pulgadas;

    public static double cent;
    public static String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        txt1 = findViewById(R.id.tV1);
        txt2 = findViewById(R.id.tV2);

        pies = getData(MainActivity.pieName);
        pulgadas = getData(MainActivity.pulgadaName);

        if (pulgadas>11){
            txt2.setText("Mayor a 11");
        }else {
            txt1.setText("N1: " + pies);
            txt2.setText("N2: " + pulgadas);
        }

    }

    public int getData(String key) {
        Bundle parametros = this.getIntent().getExtras();
        int data = 0;
        if (parametros != null) {
            data = parametros.getInt(key);
        }
        return data;
    }

    public void convertir(View view) {

        result = String.valueOf(Double.valueOf(pies)*Double.valueOf(30.57)+Double.valueOf(pulgadas)*Double.valueOf(2.54));
        returnData(view);
    }

    public void returnData(View view) {
        Intent intent = new Intent();
        intent.putExtra(MainActivity.REQUEST_RESULT, result);
        setResult(RESULT_OK, intent);
        finish();
    }
}