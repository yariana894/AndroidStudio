package com.example.vistareciclaje;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Nombres> listaNombres;
    RecyclerView recyclerNombres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaNombres = new ArrayList<>();
        recyclerNombres = (RecyclerView) findViewById(R.id.recicledId);
        recyclerNombres.setLayoutManager(new LinearLayoutManager(this));
        llenarNombres(); //método para poblar el adapater
        MiAdaptador adaptador = new MiAdaptador(listaNombres);
        recyclerNombres.setAdapter(adaptador);
    }

    private void llenarNombres() {

        //como instanciar un drawable
        listaNombres.add(new Nombres("Galicia", "Santiago", R.drawable.galicia));
        listaNombres.add(new Nombres("Andalucía", "Sevilla", R.drawable.andalucia));
        listaNombres.add(new Nombres("Asturias", "Oviedo", R.drawable.asturias));
        listaNombres.add(new Nombres("Cantabria", "Santander", R.drawable.cantabria));
        listaNombres.add(new Nombres("Euzkadi", "Vitoria/Gasteiz", R.drawable.euzkadi));
        listaNombres.add(new Nombres("Navarra", "Pamplona", R.drawable.navarra));
        listaNombres.add(new Nombres("Aragón", "Zaragoza", R.drawable.aragon));
        listaNombres.add(new Nombres("Cataluña", "Barceloan", R.drawable.catalunha));
        listaNombres.add(new Nombres("C.Valenciana", "Valencia", R.drawable.valencia));
        listaNombres.add(new Nombres("Baleares", "Palma de Mallorca", R.drawable.baleares));
        listaNombres.add(new Nombres("C Murciana", "Murcia", R.drawable.murcia));
        listaNombres.add(new Nombres("Castilla Leon", "Valladolid", R.drawable.castillaleon));
        listaNombres.add(new Nombres("Castilla la mancha", "Toledo", R.drawable.castillamancha));
        listaNombres.add(new Nombres("Extremadura", "Merida", R.drawable.extremadura));
        listaNombres.add(new Nombres("Canarias", "Las Palmas", R.drawable.canarias));
        listaNombres.add(new Nombres("C. Madrid", "Madrid", R.drawable.madrid));
        listaNombres.add(new Nombres("La Rioja", "Logroño", R.drawable.rioja));
    }
}