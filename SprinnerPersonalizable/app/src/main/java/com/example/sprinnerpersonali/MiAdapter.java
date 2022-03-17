package com.example.sprinnerpersonali;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class MiAdapter extends ArrayAdapter<Estados> {

    private Context ctx;
    private int layout;
    private ArrayList<Estados> names;

    public MiAdapter(Context ctx, int layout, ArrayList<Estados> names) {
        super(ctx, layout, names);
        this.ctx = ctx;
        this.layout = layout;
        this.names = names;

    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return crearFilaPersonalizada(position, convertView, parent);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        return crearFilaPersonalizada(position, convertView, parent);
    }

    private View crearFilaPersonalizada(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(this.ctx);
        View miFila = inflater.inflate(R.layout.linea, parent, false);

        TextView nombre = miFila.findViewById(R.id.nombre);
        nombre.setText(names.get(position).getNombre());

        TextView capital = miFila.findViewById(R.id.capital);
        capital.setText(names.get(position).getCapital());

        TextView extension = miFila.findViewById(R.id.extension);
        extension.setText(names.get(position).getExtension());

        TextView habitantes = miFila.findViewById(R.id.habitantes);
        habitantes.setText(names.get(position).getHabitantes());

        ImageView imagen = miFila.findViewById(R.id.imagenCiudad);
        imagen.setImageResource(names.get(position).getBandera());

        return miFila;
    }
}
