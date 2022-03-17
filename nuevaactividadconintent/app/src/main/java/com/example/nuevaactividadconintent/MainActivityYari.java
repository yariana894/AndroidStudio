package com.example.nuevaactividadconintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivityYari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchIntent(View view) {
        Intent intento = new Intent(Intent.ACTION_VIEW);

        intento.setData(Uri.parse("https://www.google.com/"));
        startActivity(intento);
    }

    public void enviarMensaje(View view) {
        //solo numero
        /*  String number = "12346556";  // The number on which you want to send SMS
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));
        }*/

        //numero y TEXTO

        Uri uri = Uri.parse("smsto:12346556");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", "Here you can set the SMS text to be sent");
        startActivity(it);
    
    }
}