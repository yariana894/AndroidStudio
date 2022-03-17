package com.example.mispreferencias;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/*
* Ruta hasta el fichero de las preferencias:
* /data/data/com.example.mispreferencias/shared_prefs/MainActivity.xml
* */

public class MainActivity extends AppCompatActivity {

    static final String KEY_COUNTER = "COUNTER";
    private int myCounter = 0;

    static final String KEY_TEXT1 = "TEXT1";
    static final String KEY_TEXT2 = "TEXT2";
    static final String KEY_BOOLEAN = "BOOLEAN";

    EditText editText1;
    EditText editText2;
    CheckBox checkBox;

    String text1;
    String text2;
    Boolean aBoolean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        checkBox = (CheckBox) findViewById(R.id.checkBox);

        SharedPreferences settings = getPreferences(MODE_PRIVATE);
        int defaultCounter = 0;
        myCounter = settings.getInt(KEY_COUNTER, defaultCounter);
        ((TextView) findViewById(R.id.textViewCounter))
                .setText("COUNTER: " + Integer.toString(myCounter));

        text1 = settings.getString(KEY_TEXT1, "");
        editText1.setText(text1);
        text2 = settings.getString(KEY_TEXT2, "");
        editText2.setText(text2);
        aBoolean = settings.getBoolean(KEY_BOOLEAN, true);
        checkBox.setChecked(aBoolean);

    }

    public void onClickCounterUp(View view) {
        myCounter++;
        ((TextView) findViewById(R.id.textViewCounter))
                .setText("Counter: " + Integer.toString(myCounter));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();
        aBoolean = checkBox.isChecked();
        outState.putInt(KEY_COUNTER, myCounter);
        outState.putString(KEY_TEXT1, text1);
        outState.putString(KEY_TEXT2, text2);
        outState.putBoolean(KEY_BOOLEAN, aBoolean);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        myCounter = savedInstanceState.getInt(KEY_COUNTER);
        text1 = savedInstanceState.getString(KEY_TEXT1);
        text2 = savedInstanceState.getString(KEY_TEXT2);
        aBoolean = savedInstanceState.getBoolean(KEY_BOOLEAN);
        checkBox.setChecked(aBoolean);
    }

    @Override
    protected void onPause() {
        super.onPause();
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();
        aBoolean = checkBox.isChecked();
        SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(KEY_COUNTER, myCounter);
        editor.putString(KEY_TEXT1, text1);
        editor.putString(KEY_TEXT2, text2);
        editor.putBoolean(KEY_BOOLEAN, aBoolean);
        editor.commit();
    }
}