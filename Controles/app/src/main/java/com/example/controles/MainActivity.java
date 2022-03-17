package com.example.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        CheckBox.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = findViewById(R.id.radioGrupo);
        rg.setOnCheckedChangeListener(this);

        CheckBox cb = findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //gestión del radio botón
        TextView tv = findViewById(R.id.mensajeF);
        switch (i) {
            case R.id.radioButton:
                tv.setText("El coruxo no tiene pasta");
                break;

            case R.id.radioButton2:
                tv.setText("Mientras no entre Amancio...");
                break;
            case R.id.radioButton3:
                tv.setText("Las abejas ya no pueden caer más");
                break;
            case R.id.radioButton4:
                tv.setText("No tienes corazón chaval");
                break;
        }
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        TextView estado = findViewById(R.id.mensajeF);
        if (b)
            estado.setText("Me gusta");
        else
            estado.setText("friki");
    }
}