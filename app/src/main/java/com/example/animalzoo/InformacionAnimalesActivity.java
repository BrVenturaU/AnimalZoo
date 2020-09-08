package com.example.animalzoo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.Services.AnimalService;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class InformacionAnimalesActivity extends AppCompatActivity implements
        View.OnClickListener{
    private ImageButton imgAnimal;
    private TextView tvNombreAnimal, tvDescripcionAnimal, tvNomCientificoAnimal, tvClaseAnimal, tvOrdenAnimal,
            tvFamiliaAnimal, tvAlimentacionAnimal, tvHabitatAnimal, tvCamadaAnimal, tvGestacionAnimal;
    private IAnimalService animalService;
    private Animal animal;
    private FloatingActionButton btnSilenciar;
    private boolean isSound = false;
    private double inicio = 0, fin = 0;
    private Handler handler = new Handler();
    private MediaPlayer sonidoAnimal;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_animales);
        animalService = new AnimalService();
        int animalPosition = getIntent().getExtras().getInt("animalPosition");
        animal = animalService.listOfAnimals().get(animalPosition);

        imgAnimal = findViewById(R.id.imgButtonAnimal);
        btnSilenciar = findViewById(R.id.btnSilenciar);

        tvNombreAnimal = findViewById(R.id.tvNombreAnimal);
        tvDescripcionAnimal = findViewById(R.id.tvDescripcionAnimal);
        tvNomCientificoAnimal = findViewById(R.id.tvNomCientificoAnimal);
        tvClaseAnimal = findViewById(R.id.tvClaseAnimal);
        tvOrdenAnimal = findViewById(R.id.tvOrdenAnimal);
        tvFamiliaAnimal = findViewById(R.id.tvFamiliaAnimal);
        tvAlimentacionAnimal = findViewById(R.id.tvAlimentacionAnimal);
        tvHabitatAnimal = findViewById(R.id.tvHabitatAnimal);
        tvCamadaAnimal = findViewById(R.id.tvCamadaAnimal);
        tvGestacionAnimal = findViewById(R.id.tvGestacionAnimal);

        imgAnimal.setImageResource(animal.getImagen());
        tvNombreAnimal.setText(animal.getNombre());
        tvDescripcionAnimal.setText(animal.getDescripcion());
        tvNomCientificoAnimal.setText(animal.getNombreCientifico());
        tvClaseAnimal.setText(animal.getClase());
        tvOrdenAnimal.setText(animal.getOrden());
        tvFamiliaAnimal.setText(animal.getFamilia());
        tvAlimentacionAnimal.setText(animal.getFamilia());
        tvHabitatAnimal.setText(animal.getHabitat());
        tvCamadaAnimal.setText(animal.getCamada());
        tvGestacionAnimal.setText(animal.getGestacion());

        imgAnimal.setOnClickListener(this);
        btnSilenciar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgButtonAnimal:{
                if(sonidoAnimal == null){
                    startAudio();
                }else if(isSound){
                    pauseAudio();
                }else{
                    resumeAudio();
                }

                break;
            }
            case R.id.btnSilenciar:{
                if(sonidoAnimal == null){
                    startAudio();
                }else if(isSound){
                    pauseAudio();
                }else{
                    resumeAudio();
                }

            }
        }
    }

    @Override
    protected void onDestroy() {

        if(sonidoAnimal != null)
            releaseAudio();
        super.onDestroy();
    }

    private void startAudio(){
        btnSilenciar.setImageResource(R.drawable.ic_pause);
        sonidoAnimal = MediaPlayer.create(this,animal.getAudio());
        sonidoAnimal.start();
        fin = sonidoAnimal.getDuration();
        inicio = sonidoAnimal.getCurrentPosition();
        isSound = !isSound;
        handler.postDelayed(UpdateSongTime, 100);
    }

    private void resumeAudio(){
        btnSilenciar.setImageResource(R.drawable.ic_pause);
        sonidoAnimal.seekTo((int) inicio);
        sonidoAnimal.start();
        isSound = !isSound;
    }

    private void pauseAudio(){
        inicio = sonidoAnimal.getCurrentPosition();
        sonidoAnimal.pause();
        btnSilenciar.setImageResource(R.drawable.ic_play);
        isSound = !isSound;
    }

    private void stopAudio(){
        try{
            if(sonidoAnimal.isPlaying() || isSound){
                isSound = !isSound;
                btnSilenciar.setImageResource(R.drawable.ic_play);
                releaseAudio();
            }
        }catch (Exception ex){
            Toast.makeText(InformacionAnimalesActivity.this, "La canción ya se detuvo", Toast.LENGTH_SHORT).show();
        }
    }

    private void releaseAudio(){
        handler.removeCallbacks(UpdateSongTime);
        sonidoAnimal.stop();
        sonidoAnimal.reset();
        sonidoAnimal.release();
        sonidoAnimal = null;
    }

    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            inicio = sonidoAnimal != null ? sonidoAnimal.getCurrentPosition() : 0;
            handler.postDelayed(this, 100);
            if(sonidoAnimal.getCurrentPosition() >= fin){
                btnSilenciar.setImageResource(R.drawable.ic_play);
                releaseAudio();
            }

        }
    };
}