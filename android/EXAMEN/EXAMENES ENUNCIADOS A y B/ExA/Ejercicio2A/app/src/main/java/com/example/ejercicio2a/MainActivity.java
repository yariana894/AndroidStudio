package com.example.ejercicio2a;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView textViewFahr;
    TextView textViewCels;
    TextView textViewKel;
    TextView textViewRank;
    TextView textViewReaumur;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Spinner) findViewById(R.id.spinner)).setOnItemSelectedListener(this);
        editText = findViewById(R.id.editTextTextPersonName);

        textViewFahr = (TextView) findViewById(R.id.textViewFahren);
        textViewCels = (TextView) findViewById(R.id.textViewCelsius);
        textViewKel = (TextView) findViewById(R.id.textViewKelvin);
        textViewRank = (TextView) findViewById(R.id.textViewRankine);
        textViewReaumur = (TextView) findViewById(R.id.textViewReaumur);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String valor = editText.getText().toString();

        if (parent.getSelectedItem().equals("Selecciona")) {
            textViewFahr.setText(" ");
            textViewCels.setText(" ");
            textViewKel.setText(" ");
            textViewRank.setText(" ");
            textViewReaumur.setText(" ");


        } else if (parent.getSelectedItem().equals("Fahrenheit")) {
            textViewFahr.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double valorFK = (valorDouble + 459.67) * 5 / 9;
            String res = String.valueOf(valorFK);
            textViewKel.setText(res);

            double valorFC = (valorDouble - 32) * 5 / 9;
            String res2 = String.valueOf(valorFC);
            textViewCels.setText(res2);

            double valorFRa = valorDouble + 459.67;
            String res4 = String.valueOf(valorFRa);
            textViewRank.setText(res4);

            double valorFRe = (valorDouble - 32) * 4 / 9;
            String res3 = String.valueOf(valorFRe);
            textViewReaumur.setText(res3);

        } else if (parent.getSelectedItem().equals("Celsius")) {
            textViewCels.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double valorCK = valorDouble + 273.15;
            String res = String.valueOf(valorCK);
            textViewKel.setText(res);

            double valorCF = (valorDouble * 9 / 5) + 32;
            String res2 = String.valueOf(valorCF);
            textViewFahr.setText(res2);

            double valorCRa = (valorDouble + 273.15) * 9 / 5;
            String res4 = String.valueOf(valorCRa);
            textViewRank.setText(res4);

            double valorCRe = (valorDouble) * 4 / 5;
            String res3 = String.valueOf(valorCRe);
            textViewReaumur.setText(res3);

        } else if (parent.getSelectedItem().equals("Kelvin")) {
            textViewKel.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double valorKC = valorDouble - 273.15;
            String res2 = String.valueOf(valorKC);
            textViewCels.setText(res2);

            double valorKF = ((valorDouble) * 9 / 5) - 459.67;
            String res = String.valueOf(valorKF);
            textViewFahr.setText(res);

            double valorKRa = (valorDouble) * 9 / 5;
            String res4 = String.valueOf(valorKRa);
            textViewRank.setText(res4);

            double valorKRe = (valorDouble - 273.15) * 4 / 5;
            String res3 = String.valueOf(valorKRe);
            textViewReaumur.setText(res3);

        } else if (parent.getSelectedItem().equals("Reaumur")) {
            textViewReaumur.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double valorREK = ((valorDouble) * 5 / 9) + 273.15;
            String res = String.valueOf(valorREK);
            textViewKel.setText(res);

            double valorREC = (valorDouble) * 5 / 4;
            String res2 = String.valueOf(valorREC);
            textViewCels.setText(res2);

            double valorREF = ((valorDouble) * 9 / 4) + 32;
            String res4 = String.valueOf(valorREF);
            textViewFahr.setText(res4);

            double valorFRa = ((valorDouble) * 9 / 4) + 491.67;
            String res3 = String.valueOf(valorFRa);
            textViewRank.setText(res3);

        } else if (parent.getSelectedItem().equals("Rankine")) {
            textViewRank.setText(valor);

            double valorDouble = Double.parseDouble(valor);

            double valorREK = (valorDouble) * 5 / 9;
            String res = String.valueOf(valorREK);
            textViewKel.setText(res);

            double valorREC = ((valorDouble) - 491.67) * 5 / 9;
            String res2 = String.valueOf(valorREC);
            textViewCels.setText(res2);

            double valorREF = (valorDouble) - 459.67;
            String res4 = String.valueOf(valorREF);
            textViewFahr.setText(res4);

            double valorFRe = ((valorDouble) - 491.67) * 4 / 9;
            String res3 = String.valueOf(valorFRe);
            textViewReaumur.setText(res3);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
