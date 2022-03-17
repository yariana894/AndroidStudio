package com.example.vistareciclaje;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.miSoporteVisual>{

    //variables globales necesarias OBJETOS NOMBRE
    ArrayList<Nombres> listaNombres;
    //constructor
    public MiAdaptador(ArrayList<Nombres> listaNombres) {
        this.listaNombres = listaNombres;
    }
    @Override
    public miSoporteVisual onCreateViewHolder( ViewGroup parent, int viewType) {
        //sobrescribir el metodo para preparar la vista fila
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila,null,false);
        return new miSoporteVisual(view);
    }
    @Override
    public void onBindViewHolder(miSoporteVisual mSV, @SuppressLint("RecyclerView") int position) {
        // pillo un texto y lo coloco en el textView
        //usamos los getters de la clase nombre para cargar la info en el soporte visual
        mSV.nombres.setText(listaNombres.get(position).getNombre());
        mSV.capital.setText(listaNombres.get(position).getCapital());
        //OJO CON LA FORMA DE CARGAR UN RECURSO DRAWABLE MEDIANTE setImageResource
        mSV.bandera.setImageResource((listaNombres.get(position).getBandera()));
        //preparamos un listener para el soporte visual
        mSV.itemView.setOnClickListener(new View.OnClickListener() {

            //clase anonima
            @Override
            public void onClick(View v) {
                int pos=position;
                remove(pos);
            }
        });


    }
    //Método clásico para contar el numero de elementos de la lista que pruebla el recicler
    @Override
    public int getItemCount() {
        if (listaNombres==null){
            return 0;
        }else {
            return listaNombres.size();
        }
    }

    private void remove(int pos) {
        //elimino un item del arraylist
        listaNombres.remove(pos);
        //aviso al adaptador que hemos quitado un elemento
        //ItemRemoved(position);
        //MAS ACTUAL
        notifyDataSetChanged();
    }



    //CLASE INTERNA
    class miSoporteVisual extends RecyclerView.ViewHolder{
        public TextView nombres, capital;
        public ImageView bandera;
        public miSoporteVisual(View itemView) {
            super(itemView);
            //necesito dos vistas TV para la fila
            nombres = (TextView) itemView.findViewById(R.id.idNombre) ;
            capital = (TextView) itemView.findViewById(R.id.idCapital);
            bandera = (ImageView) itemView.findViewById(R.id.idBandera);
        }
    }
}