package com.example.tirandodewidget2;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String VIDEO_SAMPLE = "video";

    VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instancia ael widget
        vv = (VideoView) findViewById(R.id.videoView);

        CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        TextView tf = (TextView) findViewById(R.id.textFecha);

        CalendarView.OnDateChangeListener odcl = new CalendarView.OnDateChangeListener() {
            //necesitamos un evento de cambiar la fecha en el calendar onSelectedDayChange
            //recoger la fecha
            //mostrarla en el edit text inferior
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // Build string from chosen date to parse into Date object
                // (month+1) because months count from 0 in java but SimpleDateFormat parses it as 1-12
                //EditText mos= findViewById(R.id.mostrar);

                //String chosenDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                //mos.setText(chosenDate);

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String selectedDate = sdf.format(new Date(calendar.getDate()));
                tf.setText(selectedDate);
            }
        };
        calendar.setOnDateChangeListener(odcl);
    }

    //método para encontrar el video raw (PROBAR MÁS TARDE CARGA DESDE INTERNET)
    private Uri getMediaLocal(String mediaName) {
        return Uri.parse("android.resource://" + getPackageName() +
                "/raw/" + mediaName);
    }

    //método para encontrar el video raw (PROBAR MÁS TARDE CARGA DESDE INTERNET)
    private Uri getMediaInternet(String mediaName) {
        return Uri.parse(mediaName);
    }

    //carga dinámica del objeto uri -->video
    public void verVideo(View view) {
        Uri videoUri = getMediaLocal(VIDEO_SAMPLE);
        vv.setVideoURI(videoUri);
        vv.start();
    }


    //carga dinámica del objeto uri -->video
    public void verInternet(View view) {
        Uri videoUri = getMediaLocal(VIDEO_SAMPLE);
        vv.setVideoURI(videoUri);
        vv.start();
    }

    /*private void releasePlayer() {
        vv.stopPlayback();
    }


    @Override
    protected void onStop() {
        super.onStop();

        releasePlayer();
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            vv.pause();
        }
    }*/


    //método para cargar el video ene l videoview
   /* public void verVideo(View view) {
        MediaController mediaController = new MediaController(this);
        //inicializa la videoview

        //asigna los controles multipmedia a la videoview
        vv.setMediaController(mediaController);
        vv.requestFocus();
        vv.start();
    }*/
}