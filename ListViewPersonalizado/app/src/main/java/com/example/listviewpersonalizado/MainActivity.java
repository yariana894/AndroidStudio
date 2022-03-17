package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    ArrayList<Nombres> listaCiudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView l = (ListView) findViewById(R.id.listView);
        listView = findViewById(R.id.listView);
        listaCiudades = new ArrayList<Nombres>();
        llenar();

        MiAdaptador adapter = new MiAdaptador(this, R.layout.linea, listaCiudades);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                TextView tv = findViewById(R.id.seleccion);
                tv.setText("Has pulsado: " + listaCiudades.get(position).getNombre());
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