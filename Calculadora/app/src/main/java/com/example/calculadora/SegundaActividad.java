package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActividad extends AppCompatActivity {

    TextView txt1;
    TextView txt2;

    public static int num1;
    public static int num2;
    public static String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        txt1 = findViewById(R.id.tV1);
        txt2 = findViewById(R.id.tV2);

        num1 = getData(MainActivity.n1Name);
        num2 = getData(MainActivity.n2Name);


        txt1.setText("N1: " + num1);
        txt2.setText("N2: " + num2);
    }

    public int getData(String key) {
        Bundle parametros = this.getIntent().getExtras();
        int data = 0;
        if (parametros != null) {
            data = parametros.getInt(key);
        }
        return data;
    }

    public void multiply(View view) {
        result = num1 + " * " + num2 + " = " + Double.valueOf(num1) * Double.valueOf(num2);
        returnData(view);
    }

    public void divide(View view) {
        result = num1 + " / " + num2 + " = " + Double.valueOf(num1) / Double.valueOf(num2);
        returnData(view);
    }

    public void returnData(View view) {
        Intent intent = new Intent();
        intent.putExtra(MainActivity.REQUEST_RESULT, result);
        setResult(RESULT_OK, intent);
        finish();
    }

}