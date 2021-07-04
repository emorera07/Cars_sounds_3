package com.example.carssoundsapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_note_do:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.do_men);
                mp.start();
                break;
            case R.id.bt_note_re:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.re);
                mp.start();
                break;
            case R.id.bt_note_mi:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.mi);
                mp.start();
                break;
            case R.id.bt_note_fa:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.fa);
                mp.start();
                break;
            case R.id.bt_note_sol:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.sol);
                mp.start();
                break;
            case R.id.bt_note_la:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.la);
                mp.start();
                break;
            case R.id.bt_note_si:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.si);
                mp.start();
                break;
            case R.id.bt_note_do_m:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.do_may);
                mp.start();
                break;
            case R.id.bt_inicio:
                Toast.makeText(getApplicationContext(),"Iniciando secuencia de sonidos",Toast.LENGTH_LONG).show();
                int numero = ThreadLocalRandom.current().nextInt(1, 5 + 1);
                switch (numero){
                    case 1:
                        Toast.makeText(getApplicationContext(),"Sonido 1",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),"Sonido 2",Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(),"Sonido 3",Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(),"Sonido 4",Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(),"Sonido 5",Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(),"Sonido 6",Toast.LENGTH_LONG).show();
                        break;
                }
        }
    }
}