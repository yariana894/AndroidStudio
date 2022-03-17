package com.example.ej4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Equipos> listaEquipos;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinner);
        listaEquipos = new ArrayList<Equipos>();
        llenar();

        MiAdapter adapter = new MiAdapter(this, R.layout.linea, listaEquipos);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = findViewById(R.id.seleccion);
                tv.setText("Has pulsado: " + listaEquipos.get(position).getNombre());

                ImageView i = (ImageView) findViewById(R.id.imgResultado);
                i.setImageResource(listaEquipos.get(position).getEscudo());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void llenar() {
        listaEquipos.add(new Equipos("Chelsea FC", "Londres", "1905", "Inglaterra", R.drawable.img));
        listaEquipos.add(new Equipos("FC Bayern", "Munich", "1900", "Alemania", R.drawable.img_1));
        listaEquipos.add(new Equipos("FK Spartak", "Moscú", "1922", "Rusia", R.drawable.img_2));
        listaEquipos.add(new Equipos("Atlético", "Madrid", "1903", "España", R.drawable.img_3));
    }
}