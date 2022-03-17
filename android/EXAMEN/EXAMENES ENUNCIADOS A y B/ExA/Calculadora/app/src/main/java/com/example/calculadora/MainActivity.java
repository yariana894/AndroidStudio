package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText n1 = null;
    EditText n2 = null;

    TextView sol;

    public static final String n1Name = "NATURAL1";
    public static final String n2Name = "NATURAL2";
    public static final String REQUEST_RESULT = "REQUEST_RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        sol = findViewById(R.id.solution);
    }

    public void sendData(View view) {
        Intent intent = new Intent(this, SegundaActividad.class);
        Bundle bundle = new Bundle();

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());

        bundle.putInt(n1Name, num1);
        bundle.putInt(n2Name, num2);

        intent.putExtras(bundle);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if(resultCode==RESULT_OK) {
            sol.setText(intent.getStringExtra(REQUEST_RESULT));
        }
    }

}