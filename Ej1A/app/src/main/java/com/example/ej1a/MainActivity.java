package com.example.ej1a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText pie = null;
    EditText pulgada = null;

    TextView sol;

    public static final String pieName = "NATURAL1";
    public static final String pulgadaName = "NATURAL2";
    public static final String REQUEST_RESULT = "REQUEST_RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pie = findViewById(R.id.pies);
        pulgada = findViewById(R.id.pulgadas);

        sol = findViewById(R.id.solution);
    }

    public void sendData(View view) {
        Intent intent = new Intent(this, SegundaActividad.class);
        Bundle bundle = new Bundle();

        int num1 = Integer.parseInt(pie.getText().toString());
        int num2 = Integer.parseInt(pulgada.getText().toString());

        bundle.putInt(pieName, num1);
        bundle.putInt(pulgadaName, num2);

        intent.putExtras(bundle);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (resultCode == RESULT_OK) {
            sol.setText(intent.getStringExtra(REQUEST_RESULT));
        }
    }
}