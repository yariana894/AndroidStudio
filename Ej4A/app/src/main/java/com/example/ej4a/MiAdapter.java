package com.example.ej4a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MiAdapter  extends ArrayAdapter<Equipos> {

    private Context context;
    private int layout;
    private ArrayList<Equipos> equipos;


    public MiAdapter(Context context, int layout, ArrayList<Equipos> equipos) {
        super(context, layout, equipos);
        this.context = context;
        this.layout = layout;
        this.equipos = equipos;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return crearFilaPersonalizada(position, convertView, parent);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return crearFilaPersonalizada(position, convertView, parent);
    }

    private View crearFilaPersonalizada(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        View miFila = inflater.inflate(R.layout.linea, parent, false);

        TextView nombre = miFila.findViewById(R.id.nombre);
        nombre.setText(equipos.get(position).getNombre());

        TextView ciudad = miFila.findViewById(R.id.ciudad);
        ciudad.setText(equipos.get(position).getCiudad());

        TextView anho = miFila.findViewById(R.id.anho);
        anho.setText(equipos.get(position).getAnho());

        TextView pais = miFila.findViewById(R.id.pais);
        pais.setText(equipos.get(position).getPais());

        ImageView imagen = miFila.findViewById(R.id.escudo);
        imagen.setImageResource(equipos.get(position).getEscudo());

        return miFila;
    }

}
