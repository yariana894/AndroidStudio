package com.example.ejercicio4b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Estados> listaEstados;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinner);
        listaEstados = new ArrayList<Estados>();
        llenar();

        MiAdapter adapter = new MiAdapter(this, R.layout.linea, listaEstados);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = findViewById(R.id.seleccion);
                tv.setText("Has pulsado: " + listaEstados.get(position).getNombre());

                //ImageView i = (ImageView) findViewById(R.id.imgResultado);
                //i.setImageResource(listaEstados.get(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void llenar() {
        listaEstados.add(new Estados("Alemania", "Berlín", "80 722 792 ", "357 022", R.drawable.img));
        listaEstados.add(new Estados("Eslovaquia", "Bratislava", "5 445 802", "49 035", R.drawable.img_1));
        listaEstados.add(new Estados("Grecia", "Atenas", "10 773 253", "131 957", R.drawable.img_2));
        listaEstados.add(new Estados("Lituania", "Vilna", "2 854 235 ", "65 300", R.drawable.img_3));
        listaEstados.add(new Estados("Portugal", "Lisboa", "10 833 816", "92 090", R.drawable.img_4));
        listaEstados.add(new Estados("Suecia", "Estocolmo", "9 880 604", "450 295", R.drawable.img_5));
    }
}