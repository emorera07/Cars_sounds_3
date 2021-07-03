package com.example.carssoundsapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp1, mp2, mp3, mp4, mp5, mp6, mp7, mp8;
    Button bt_note_do;
    Button bt_note_re;
    Button bt_note_mi;
    Button bt_note_fa;
    Button bt_note_sol;
    Button bt_note_la;
    Button bt_note_si;
    Button bt_note_do_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_note_do = (Button)findViewById(R.id.bt_note_do);
        mp1 = MediaPlayer.create(this, R.raw.do_men);
        bt_note_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                
            }
        });
        bt_note_re = (Button)findViewById(R.id.bt_note_re);
        mp2 = MediaPlayer.create(this, R.raw.re);
        bt_note_re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        bt_note_mi = (Button)findViewById(R.id.bt_note_mi);
        mp3 = MediaPlayer.create(this, R.raw.mi);
        bt_note_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        bt_note_fa = (Button)findViewById(R.id.bt_note_fa);
        mp4 = MediaPlayer.create(this, R.raw.fa);
        bt_note_fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
        bt_note_sol = (Button)findViewById(R.id.bt_note_sol);
        mp5 = MediaPlayer.create(this, R.raw.sol);
        bt_note_sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });
        bt_note_la = (Button)findViewById(R.id.bt_note_la);
        mp6 = MediaPlayer.create(this, R.raw.la);
        bt_note_la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });
        bt_note_si = (Button)findViewById(R.id.bt_note_si);
        mp7 = MediaPlayer.create(this, R.raw.si);
        bt_note_si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
            }
        });
        bt_note_do_m = (Button)findViewById(R.id.bt_note_do_m);
        mp8 = MediaPlayer.create(this, R.raw.do_may);
        bt_note_do_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
            }
        });
    }
}