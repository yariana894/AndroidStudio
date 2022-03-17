package com.example.ejercicio2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView textViewPul;
    TextView textViewPie;
    TextView textViewYar;
    TextView textViewMilla;
    TextView textViewMetro;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Spinner) findViewById(R.id.spinner)).setOnItemSelectedListener(this);
        editText = findViewById(R.id.editTextTextNumero);

        textViewPul = (TextView) findViewById(R.id.textViewPulgada);
        textViewPie = (TextView) findViewById(R.id.textViewPie);
        textViewYar = (TextView) findViewById(R.id.textViewYarda);
        textViewMilla = (TextView) findViewById(R.id.textViewMilla);
        textViewMetro = (TextView) findViewById(R.id.textViewMetro);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String valor = editText.getText().toString();

        if (parent.getSelectedItem().equals("Selecciona")) {
            textViewMetro.setText(" ");
            textViewPul.setText(" ");
            textViewPie.setText(" ");
            textViewMilla.setText(" ");
            textViewYar.setText(" ");

        } else if (parent.getSelectedItem().equals("Metro")) {
            textViewMetro.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double Pie = valorDouble * 3.28;
            String res = String.valueOf(Pie);
            textViewPie.setText(res);

            double Pul = valorDouble * 39.37;
            String res2 = String.valueOf(Pul);
            textViewPul.setText(res2);

            double Yar = valorDouble * 1.094;
            String res3 = String.valueOf(Yar);
            textViewYar.setText(res3);

            double Mil = valorDouble / 1609;
            String res4 = String.valueOf(Mil);
            textViewMilla.setText(res4);

        } else if (parent.getSelectedItem().equals("Pulgada")) {
            textViewPul.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double Pie = valorDouble / 12;
            String res = String.valueOf(Pie);
            textViewPie.setText(res);

            double Me = valorDouble / 39.37;
            String res2 = String.valueOf(Me);
            textViewMetro.setText(res2);

            double Yar = valorDouble / 36;
            String res3 = String.valueOf(Yar);
            textViewYar.setText(res3);

            double Mil = valorDouble / 63360;
            String res4 = String.valueOf(Mil);
            textViewMilla.setText(res4);

        } else if (parent.getSelectedItem().equals("Pie")) {
            textViewPie.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double Pul = valorDouble * 12;
            String res = String.valueOf(Pul);
            textViewPul.setText(res);

            double Me = valorDouble / 3.281;
            String res2 = String.valueOf(Me);
            textViewMetro.setText(res2);

            double mYar = valorDouble / 3;
            String res3 = String.valueOf(mYar);
            textViewYar.setText(res3);

            double mMil = valorDouble / 5280;
            String res4 = String.valueOf(mMil);
            textViewMilla.setText(res4);

        } else if (parent.getSelectedItem().equals("Yarda")) {
            textViewYar.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double Pul = valorDouble * 36;
            String res = String.valueOf(Pul);
            textViewPul.setText(res);

            double Me = valorDouble / 1.94;
            String res2 = String.valueOf(Me);
            textViewMetro.setText(res2);

            double Pie = valorDouble * 3;
            String res3 = String.valueOf(Pie);
            textViewPie.setText(res3);

            double Mil = valorDouble / 1760;
            String res4 = String.valueOf(Mil);
            textViewMilla.setText(res4);

        } else if (parent.getSelectedItem().equals("Milla")) {
            textViewMilla.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double Pul = valorDouble * 63360;
            String res = String.valueOf(Pul);
            textViewPul.setText(res);

            double Me = valorDouble * 1609;
            String res2 = String.valueOf(Me);
            textViewMetro.setText(res2);

            double Pie = valorDouble * 5280;
            String res3 = String.valueOf(Pie);
            textViewPie.setText(res3);

            double Yar = valorDouble * 1760;
            String res4 = String.valueOf(Yar);
            textViewYar.setText(res4);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}