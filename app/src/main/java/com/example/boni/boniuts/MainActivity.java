package com.example.boni.boniuts;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private static final String isPlaying = "Media is Playing";


    private MediaPlayer player;
    private Button burunghantuButton;
    private Button gajahButton;
    private Button kambingButton;
    private Button kucingButton;
    private Button lebahButton;
    private Button singaButton;
    private Button siputButton;
    private Button ayamButton;
    private Button guritaButton;
    private Button jerapahButton;
    private Button kepitingButton;
    private Button ularButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the button from the view
        burunghantuButton = (Button) this.findViewById(R.id.burunghantu);
        burunghantuButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);
            }
        });

        gajahButton = (Button) this.findViewById(R.id.gajah);
        gajahButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);
            }
        });

        kambingButton = (Button) this.findViewById(R.id.kambing);
        kambingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });

        kucingButton = (Button) this.findViewById(R.id.kucing);
        kucingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);

            }
        });

        lebahButton = (Button) this.findViewById(R.id.lebah);
        lebahButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });

        singaButton = (Button) this.findViewById(R.id.singa);
        singaButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

            }
        });

        siputButton = (Button) this.findViewById(R.id.siput);
        siputButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);

            }
        });

        ayamButton = (Button) this.findViewById(R.id.ayam);
        ayamButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);

            }
        });

        guritaButton = (Button) this.findViewById(R.id.gurita);
        guritaButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);

            }
        });

        jerapahButton = (Button) this.findViewById(R.id.jerapah);
        jerapahButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(10);

            }
        });

        kepitingButton = (Button) this.findViewById(R.id.kepiting);
        kepitingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(11);

            }
        });

        ularButton = (Button) this.findViewById(R.id.ular);
        ularButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(12);

            }
        });
    }

    @Override
    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){
        }
    }


    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
//            Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
        }
        if (arg == 1){

//            Toast.makeText(this, isPlaying+" Burung Hantu", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.burunghantu);

        }else if (arg==2){
//            Toast.makeText(this, isPlaying+" Gajah", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.gajah);
        }else if (arg==3){
//            Toast.makeText(this, isPlaying+" Kambing", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kambing);
        }else if (arg==4){
//            Toast.makeText(this, isPlaying+" Kucing", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kucing);
        }else if (arg==5){
//            Toast.makeText(this, isPlaying+" Lebah", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lebah);
        }else if (arg==6){
//            Toast.makeText(this, isPlaying+" Singa", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.singa);
        }else if (arg==7){
//            Toast.makeText(this, isPlaying+" Siput", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.siput);
        }else if (arg==8){
//            Toast.makeText(this, isPlaying+" Ayam", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ayam);
        }else if (arg==9){
//            Toast.makeText(this, isPlaying+" Gurita", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.gurita);
        }else if (arg==10){
//            Toast.makeText(this, isPlaying+" Jerapah", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.jerapah);
        }else if (arg==11){
//            Toast.makeText(this, isPlaying+" Kepiting", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kepiting);
        }else if (arg==12){
//            Toast.makeText(this, isPlaying+" Ular", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ular);
        }

        player.setLooping(false); // Set looping
        player.start();
    }
}
