package com.example.numerosprimos;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> primos = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*EditText numero = findViewById(R.id.posicion);
        Button boton = findViewById(R.id.boton);
        TextView resultado = findViewById(R.id.solucion);*/

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void calcularPrimo(View view) {

        EditText numero = (EditText) findViewById(R.id.posicion);
        int num = Integer.parseInt(numero.getText().toString());
        //Toast.makeText(this, "El número es " + num, Toast.LENGTH_SHORT).show();
        //Integer res = primos.get(Integer.parseInt(num));
        //Toast.makeText(this, "El número es " + res, Toast.LENGTH_SHORT).show();

        TextView resultado = (TextView) findViewById(R.id.resultado);

        if (num < primos.size()) {
            resultado.setText("Solución: " + primos.get(num));
        }else {
            resultado.setText("Mayor al arraylist");
        }



    }
}