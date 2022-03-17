package com.example.obteniendoresultados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String REQUEST_RESULT = "REQUEST_RESULT";
    public static final String REQUEST_RESULT2 = "REQUEST_RESULT2";
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.cajaEditText);
        editText2 = (EditText) findViewById(R.id.cajaEditText2);

    }

    public void mandarDatoSegundaActividad(View view) {

        String text = editText.getText().toString();
        String text2 = editText2.getText().toString();

        Intent intent = new Intent(this, SegundaActividad.class);
        Bundle bundle = new Bundle();
        bundle.putString("texto1", text);
        bundle.putString("texto2", text2);
        intent.putExtras(bundle);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle dataTexto = data.getExtras();

        if (resultCode == RESULT_OK) {
            editText.setText(dataTexto.getString(REQUEST_RESULT));
            editText2.setText(dataTexto.getString(REQUEST_RESULT2));
        } else {
            editText.setText("No han llegado datos");
            editText2.setText("No han llegado datos");
        }
    }
}