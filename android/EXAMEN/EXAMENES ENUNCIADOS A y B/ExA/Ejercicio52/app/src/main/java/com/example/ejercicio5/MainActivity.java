package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    String[] nombres = {"Chelsea FC", "FC Bayern", "FK Spartak", "Atlético Madrid"};
    int imagenes[] = {R.drawable.img, R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3};
    String[] ciudades = {"Londres", "Múnich", "Moscú", "Madrid"};
    String[] paises = {"Inglaterra", "Alemania", "Rusia", "España"};
    String[] anhos = {"1905", "1900", "1922", "1903"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner selectorCiudades = (Spinner) findViewById(R.id.spinner);

        AdaptadorPersonalizado a = new AdaptadorPersonalizado(this, R.layout.linea, nombres);

        selectorCiudades.setAdapter(a);
        selectorCiudades.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(parent.getItemAtPosition(position).toString());

        ImageView i = (ImageView) findViewById(R.id.imgResultado);
        i.setImageResource(imagenes[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


    public class AdaptadorPersonalizado extends ArrayAdapter<String> {
        public AdaptadorPersonalizado(Context ctx, int txtViewResourceId, String[] objects) {
            super(ctx, txtViewResourceId, objects);
        }

        @Override
        public View getDropDownView(int position, View cnvtView, ViewGroup prnt) {
            return crearFilaPersonalizada(position, cnvtView, prnt);
        }

        @Override
        public View getView(int pos, View cnvtView, ViewGroup prnt) {
            return crearFilaPersonalizada(pos, cnvtView, prnt);
        }

        public View crearFilaPersonalizada(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();

            View miFila = inflater.inflate(R.layout.linea, parent, false);

            TextView nombre = (TextView) miFila.findViewById(R.id.nombre);
            nombre.setText(MainActivity.this.nombres[position]);

            TextView ciudad = (TextView) miFila.findViewById(R.id.ciudad);
            ciudad.setText(ciudades[position]);

            TextView pais = (TextView) miFila.findViewById(R.id.pais);
            pais.setText(paises[position]);

            TextView anho = (TextView) miFila.findViewById(R.id.anho);
            anho.setText(anhos[position]);

            ImageView imagen = (ImageView) miFila.findViewById(R.id.imagenCiudad);
            imagen.setImageResource(imagenes[position]);

            return miFila;

        }

    }
}