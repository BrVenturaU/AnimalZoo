package com.example.animalzoo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class InformacionAnimalesActivity extends AppCompatActivity implements
        View.OnClickListener{

    MediaPlayer mediaPlayer;
    ImageButton imgAnimal;
    Button sileciar;

    //Se agregan mas sonidos ****
    MediaPlayer sonidoAvestruz;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_animales);


        imgAnimal = findViewById(R.id.imgButtonAnimal);
        sileciar = findViewById(R.id.btnSilenciar);
        sonidoAvestruz = MediaPlayer.create(this, R.raw.avestruz);

        imgAnimal.setOnClickListener(this);
        sileciar.setOnClickListener(this);

        imgAnimal.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {
                switch (view.getId()) {
                    case R.id.imgButtonAnimal:
                        play();
                        break;
                    case R.id.btnSilenciar:
                        stop();
                        Toast.makeText(getBaseContext(), "Sonido apagado", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgButtonAnimal:
                play();
                break;
            case R.id.btnSilenciar:
                stop();
                break;
        }
    }

    // Iniciar el sonido del animal
    private void play(){
        sonidoAvestruz.start();
    }
    // Para sonido totalmente
    private void stop(){
        sonidoAvestruz.stop();
    }
}