package com.example.obteniendoresultados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegundaActividad extends AppCompatActivity {
    EditText coloco;
    EditText coloco2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        coloco = (EditText) findViewById(R.id.llegadaEditText);
        coloco.setText(extraerDatos("text1"));

        coloco2 = (EditText) findViewById(R.id.llegadaEditText2);
        coloco2.setText(extraerDatos("text2"));
    }


    public String extraerDatos(String dato) {
        Bundle parametros = this.getIntent().getExtras();
        String datos = null;
        if (parametros != null) {
            datos = parametros.getString(dato);
        }
        return datos;
    }

    public void regresarDato(View view) {
        String text = coloco.getText().toString();
        String text2 = coloco2.getText().toString();

        Intent returnIntent = new Intent();
        Bundle extras = new Bundle();
        extras.putString(MainActivity.REQUEST_RESULT, text);
        extras.putString(MainActivity.REQUEST_RESULT2, text2);
        returnIntent.putExtras(extras);
        setResult(RESULT_OK, returnIntent);
        finish();
    }
}