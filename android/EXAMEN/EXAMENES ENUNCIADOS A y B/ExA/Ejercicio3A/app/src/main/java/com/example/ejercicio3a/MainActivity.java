package com.example.ejercicio3a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.home:
                Toast.makeText(getApplicationContext(), "Se ha pulsado Home", Toast.LENGTH_LONG).show();
                return true;

            case R.id.features:
                Toast.makeText(getApplicationContext(), "Se ha pulsado features", Toast.LENGTH_LONG).show();
                return true;

            case R.id.installations:
                Toast.makeText(getApplicationContext(), "Se ha pulsado installations", Toast.LENGTH_LONG).show();
                return true;

            case R.id.parameters:
                Toast.makeText(getApplicationContext(), "Se ha pulsado parameters", Toast.LENGTH_LONG).show();
                return true;

            case R.id.css3:
                Toast.makeText(getApplicationContext(), "Se ha pulsado css3", Toast.LENGTH_LONG).show();
                return true;

            case R.id.productInfo:
                Toast.makeText(getApplicationContext(), "Se ha pulsado Product Info", Toast.LENGTH_LONG).show();
                return true;

            case R.id.samples:
                Toast.makeText(getApplicationContext(), "Se ha pulsado Samples", Toast.LENGTH_LONG).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }


}