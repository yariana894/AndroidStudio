package com.example.seleccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {


    public void onItemClick(AdapterView<?> a, View view, int position, long id) {
        TextView t = (TextView) findViewById(R.id.textView);
        ListView l = (ListView) findViewById(R.id.listView);

        String seleccionado = new String();

        SparseBooleanArray checked = l.getCheckedItemPositions();

        for (int i = 0; i < checked.size(); i++)
            if (checked.valueAt(i)) {
                seleccionado = seleccionado +
                        a.getItemAtPosition(checked.keyAt(i)).toString()
                        + ";";
            }
        t.setText(seleccionado);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] elementos = {"Toledo", "Ciudad Real", "Cuenca", "Guadalajara", "Albacete"};

        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView l = (ListView) findViewById(R.id.listView);
        l.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, elementos);

        l.setAdapter(adaptador);
        l.setOnItemClickListener(this);
    }
}