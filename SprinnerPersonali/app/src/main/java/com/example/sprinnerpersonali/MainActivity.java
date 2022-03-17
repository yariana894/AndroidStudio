package com.example.sprinnerpersonali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Nombres> listaCiudades;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spinner);
        listaCiudades = new ArrayList<Nombres>();
        llenar();

        MiAdapter adapter = new MiAdapter(this, R.layout.linea, listaCiudades);
        sp.setAdapter(adapter);


        //ojo al tipo de listener sobre adapterView

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                TextView tv = findViewById(R.id.seleccion);
                tv.setText("Has pulsado: " + listaCiudades.get(position).getNombre());

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }

    private void llenar() {
        //como pasar un drwable al constructor de la clase nombres
        listaCiudades.add(new Nombres("Albacete", "Albacete desc", R.drawable.albacete));
        listaCiudades.add(new Nombres("Ciudad Real", "Ciudad Real desc", R.drawable.ciudadreal));
        listaCiudades.add(new Nombres("Cuenca", "Cuenca desc", R.drawable.guadalajara));
        listaCiudades.add(new Nombres("Toledo", "Toledo desc", R.drawable.toledo));


    }


}
