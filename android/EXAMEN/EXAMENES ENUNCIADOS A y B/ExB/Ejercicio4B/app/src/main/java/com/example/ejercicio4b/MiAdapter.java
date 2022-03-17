package com.example.ejercicio4b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MiAdapter extends ArrayAdapter<Estados> {

    private Context context;
    private int layout;
    private ArrayList<Estados> estados;


    public MiAdapter(Context context, int layout, ArrayList<Estados> estados) {
        super(context, layout, estados);
        this.context = context;
        this.layout = layout;
        this.estados = estados;
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
        nombre.setText(estados.get(position).getNombre());

        TextView capital = miFila.findViewById(R.id.capital);
        capital.setText(estados.get(position).getCapital());

        TextView habitantes = miFila.findViewById(R.id.habitantes);
        habitantes.setText(estados.get(position).getHabitantes());

        TextView extension = miFila.findViewById(R.id.extension);
        extension.setText(estados.get(position).getExtension());

        ImageView imagen = miFila.findViewById(R.id.bandera);
        imagen.setImageResource(estados.get(position).getBandera());

        return miFila;
    }

}
