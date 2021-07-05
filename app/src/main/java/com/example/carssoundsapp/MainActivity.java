package com.example.carssoundsapp;

import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer mp;
    Button bt_note_do, bt_note_re, bt_note_mi, bt_note_fa, bt_note_sol;
    Button bt_note_la, bt_note_si, bt_note_do_m;
    int count_bt, score;
    boolean usuario;
    public ArrayList<Integer> secuencia_aleatoria = new ArrayList<Integer>();
    public ArrayList<Integer> secuencia_usuario = new ArrayList<Integer>();
    int delay1s = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_note_do = findViewById(R.id.bt_note_do);
        bt_note_re = findViewById(R.id.bt_note_re);
        bt_note_mi = findViewById(R.id.bt_note_mi);
        bt_note_fa = findViewById(R.id.bt_note_fa);
        bt_note_sol = findViewById(R.id.bt_note_sol);
        bt_note_la = findViewById(R.id.bt_note_la);
        bt_note_si = findViewById(R.id.bt_note_si);
        bt_note_do_m = findViewById(R.id.bt_note_do_m);
        count_bt = 0;
        usuario = false;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_note_do:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.do_men);
                mp.start();
                verificacion_usuario(1);
                break;
            case R.id.bt_note_re:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.re);
                mp.start();
                verificacion_usuario(2);
                break;
            case R.id.bt_note_mi:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.mi);
                mp.start();
                verificacion_usuario(3);
                break;
            case R.id.bt_note_fa:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.fa);
                mp.start();
                verificacion_usuario(4);
                break;
            case R.id.bt_note_sol:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.sol);
                mp.start();
                verificacion_usuario(5);
                break;
            case R.id.bt_note_la:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.la);
                mp.start();
                verificacion_usuario(6);
                break;
            case R.id.bt_note_si:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.si);
                mp.start();
                verificacion_usuario(7);
                break;
            case R.id.bt_note_do_m:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.do_may);
                mp.start();
                verificacion_usuario(8);
                break;
            case R.id.bt_inicio:
                Toast.makeText(getApplicationContext(),"Iniciando secuencia de sonidos",Toast.LENGTH_LONG).show();
                int numero = ThreadLocalRandom.current().nextInt(1, 7 + 1);
                secuencia_aleatoria.add(numero);
                for (int i=0;i<secuencia_aleatoria.size();i=i+1){
                    switch (secuencia_aleatoria.get(i)){
                        case 1:
                            bt_note_do.callOnClick();
                            break;
                        case 2:
                            bt_note_re.callOnClick();
                            break;
                        case 3:
                            bt_note_mi.callOnClick();
                            break;
                        case 4:
                            bt_note_fa.callOnClick();
                            break;
                        case 5:
                            bt_note_sol.callOnClick();
                            break;
                        case 6:
                            bt_note_la.callOnClick();
                            break;
                        case 7:
                            bt_note_si.callOnClick();
                            break;
                        case 8:
                            bt_note_do_m.callOnClick();
                            break;
                    }
                }
                try {
                    Thread.sleep(secuencia_aleatoria.size()*delay1s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                usuario = true;

                Toast.makeText(getApplicationContext(),"Precione los botones de la secuencia",Toast.LENGTH_LONG).show();
                break;
        }
        try {
            Thread.sleep(delay1s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void verificacion_usuario(int id){
        if(usuario){
            if(secuencia_aleatoria.get(count_bt)==id){
                if(secuencia_aleatoria.size()<count_bt){
                    count_bt = count_bt + 1;
                }
                else{
                    Toast.makeText(getApplicationContext(),"feliciades acertó la secuencia, precione inicio para continuar",Toast.LENGTH_LONG).show();
                    score = count_bt;
                    count_bt = 0;
                    usuario = false;
                }
            }
            else{
                Toast.makeText(getApplicationContext(),"Inicie de nuevo el juego",Toast.LENGTH_LONG).show();
                score = count_bt;
                usuario = false;
                count_bt = 0;
                secuencia_aleatoria.clear();
            }
        }
    }
}