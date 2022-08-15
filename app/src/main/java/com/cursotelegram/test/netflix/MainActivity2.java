package com.cursotelegram.test.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {
    //Criando componente
    private VideoView playerJoker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Associação do componente com o Id do design java
        playerJoker = findViewById(R.id.JokerVideo);

        //Escondendo o statusBar
        View decorView = getWindow().getDecorView();
        int uiOption = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOption);

        //esconde o actionBar
        getSupportActionBar().hide();

        //Controle de video
        playerJoker.setMediaController(new MediaController(this));

        //Carrega o diretório do video no videoView
        playerJoker.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.joker);
        playerJoker.start();
    }
}