package com.example.listviewpersonalizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MiAdaptador extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Nombres> names;

    public MiAdaptador(Context context, int layout, ArrayList<Nombres> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //copiamos la vista
        View v = convertView;

        //inflamos la vista con nuetro propio layour
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        v = layoutInflater.inflate(R.layout.linea, null);
        //valor actual según la posición

        String nombre = names.get(position).getNombre();
        String desc = names.get(position).getCapital();
        int image = names.get(position).getBandera();

        //referenciamos el elemento a modificar y lo rellenamos
        TextView textView1 = v.findViewById(R.id.nombre);
        textView1.setText(nombre);
        TextView textView2 = v.findViewById(R.id.descripcion);
        textView2.setText(desc);
        ImageView iv = v.findViewById(R.id.imagenCiudad);
        iv.setImageResource(image);
        
        //devolvemos la vista inflada
        return v;
    }
}
