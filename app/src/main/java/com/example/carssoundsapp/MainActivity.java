package com.example.carssoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button bt_Aceleracion;
    Button bt_bus_freno;
    Button bt_carrera;
    Button bt_camion_helado;
    Button bt_auto_fant;
    Button bt_frenar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_Aceleracion = (Button)findViewById(R.id.bt_Aceleracion);
        mp = MediaPlayer.create(this, R.raw.aceleracion_1);
        bt_Aceleracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        bt_bus_freno = (Button)findViewById(R.id.bt_bus_freno);
        mp = MediaPlayer.create(this, R.raw.autobus_frenando);
        bt_bus_freno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        bt_auto_fant = (Button)findViewById(R.id.bt_auto_fant);
        mp = MediaPlayer.create(this, R.raw.auto_fantastico);
        bt_auto_fant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        bt_camion_helado = (Button)findViewById(R.id.bt_camion_helado);
        mp = MediaPlayer.create(this, R.raw.camion_helado);
        bt_camion_helado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        bt_carrera = (Button)findViewById(R.id.bt_carrera);
        mp = MediaPlayer.create(this, R.raw.auto_carrera);
        bt_carrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        bt_frenar = (Button)findViewById(R.id.bt_frenar);
        mp = MediaPlayer.create(this, R.raw.frenar);
        bt_frenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }
}