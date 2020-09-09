package com.example.animalzoo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.Interfaces.IDialogGameListener;
import com.example.animalzoo.Services.AnimalService;
import com.example.animalzoo.Utils.DialogGame;

import java.util.Random;

public class JuegoActivity extends AppCompatActivity implements View.OnClickListener, IDialogGameListener {
    private MediaPlayer mp;
    private IAnimalService animalService;
    private TextView txtPuntos,txtTiempo,txtVidas,txtResultado;
    private ImageView imgAnimal;
    private EditText etNombreAnimal;
    private Button btnConfirmar;
    private ImageButton btnSonido;

    private Integer intPuntos = 0;
    private Integer intVidas = 5;
    private Integer randomNumber;
    private double inicio = 0, fin = 0;
    private boolean isSound = false;
    private Animal animal;
    private Random random;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        animalService = new AnimalService();
        random = new Random();

        txtTiempo = findViewById(R.id.txtTiempo);
        txtPuntos = findViewById(R.id.txtPuntos);
        txtVidas = findViewById(R.id.txtVidas);
        imgAnimal = findViewById(R.id.imgAnimal);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        txtResultado = findViewById(R.id.txtResultado);
        btnSonido = findViewById(R.id.btnSonido);
        etNombreAnimal = findViewById(R.id.etNombreAnimal);

        txtVidas.setText(intVidas.toString());
        setAnimalGameData();

        btnSonido.setOnClickListener(this);
        btnConfirmar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnConfirmar:{
                btnSonido.setVisibility(View.GONE);
                releaseAudio();
                String nombreAnimal = etNombreAnimal.getText().toString();
                if(nombreAnimal.isEmpty() || nombreAnimal.length()==0 || nombreAnimal.equals(""))
                    Toast.makeText(JuegoActivity.this, "Escribe el nombre del animal", Toast.LENGTH_SHORT).show();
                else{
                    String nombreMinuscula = nombreAnimal.toLowerCase();
                    String nombreMayuscula = nombreAnimal.toUpperCase();
                    String nombreAnimalMinuscula = getString(animal.getNombre()).toLowerCase();
                    String nombreAnimalMayuscula = getString(animal.getNombre()).toUpperCase();

                    if(nombreMinuscula.equals(nombreAnimalMinuscula) || nombreMayuscula.equals(nombreAnimalMayuscula)){
                        txtResultado.setTextColor(Color.GREEN);
                        txtResultado.setText("¡Has acertado!");
                        txtResultado.setVisibility(View.VISIBLE);
                        intPuntos+=12;
                        txtPuntos.setText(intPuntos.toString());
                    }
                    else {
                        txtResultado.setTextColor(Color.RED);
                        txtResultado.setText("¡Te has equivocado!");
                        txtResultado.setVisibility(View.VISIBLE);
                        intVidas = intVidas < 1 ? 0 : intVidas-1;
                        txtVidas.setText(intVidas.toString());

                    }
                    if(intPuntos >= 60){
                        Intent intent = new Intent(JuegoActivity.this, CuentoActivity.class);
                        startActivity(intent);
                        finish();
                    }else if(intVidas == 0){
                        openDialog();
                    }else{
                        esperar(2000);
                    }
                }
                break;
            }
            case R.id.btnSonido:{
                if(mp == null){
                    startAudio();
                }else if(isSound){
                    pauseAudio();
                }else{
                    resumeAudio();
                }
                break;
            }
        }
    }

    @Override
    protected void onDestroy() {
        if(mp != null)
            releaseAudio();
        super.onDestroy();
    }

    void esperar(int timeInMilis){
        btnConfirmar.setVisibility(View.GONE);
        txtTiempo.setVisibility(View.VISIBLE);
        new CountDownTimer(timeInMilis,1) {
            @Override
            public void onTick(long millisUntilFinished) {
                txtTiempo.setText((millisUntilFinished/1000 +1)+"s");
            }
            @Override
            public void onFinish() {
                setAnimalGameData();
                limpiar();
            }
        }.start();
    }

    private void setAnimalGameData(){
        randomNumber = random.nextInt(animalService.getItemCount());
        animal = animalService.listOfAnimals().get(randomNumber);
        imgAnimal.setImageResource(animal.getImagen());
        startAudio();
    }

    private void limpiar(){
        btnSonido.setVisibility(View.VISIBLE);
        txtTiempo.setVisibility(View.GONE);
        btnConfirmar.setVisibility(View.VISIBLE);
        txtTiempo.setText("0s");
        txtResultado.setVisibility(View.GONE);
        etNombreAnimal.setText("");
        etNombreAnimal.setHint("Ingrese el nombre de el animal");
    }

    private void openDialog(){
        DialogGame dialogGame = new DialogGame();
        dialogGame.show(getSupportFragmentManager(), "dialogo juego");
    }

    @Override
    public void okOptionGameState(Integer puntos, Integer vidas) {
        setAnimalGameData();
        intPuntos = puntos;
        intVidas = vidas;
        txtPuntos.setText(intPuntos.toString());
        txtVidas.setText(intVidas.toString());
        limpiar();
    }
    @Override
    public void cancelOptionGameState(Intent intent) {
        startActivity(intent);
        finish();
    }

    private void startAudio(){
        btnSonido.setImageResource(R.drawable.ic_stop_game_animal_sound);
        mp = MediaPlayer.create(this,animal.getAudio());
        mp.start();
        fin = mp.getDuration();
        inicio = mp.getCurrentPosition();
        isSound = !isSound;
        handler.postDelayed(UpdateSongTime, 100);
    }

    private void resumeAudio(){
        btnSonido.setImageResource(R.drawable.ic_stop_game_animal_sound);
        mp.seekTo((int) inicio);
        mp.start();
        isSound = !isSound;
    }

    private void pauseAudio(){
        inicio = mp.getCurrentPosition();
        mp.pause();
        btnSonido.setImageResource(R.drawable.ic_play_game_animal_sound);
        isSound = !isSound;
    }

    private void stopAudio(){
        try{
            if(mp.isPlaying() || isSound){
                isSound = !isSound;
                btnSonido.setImageResource(R.drawable.ic_play_game_animal_sound);
                releaseAudio();
            }
        }catch (Exception ex){
            Toast.makeText(JuegoActivity.this, "El sonido del animal ya se detuvo.", Toast.LENGTH_SHORT).show();
        }
    }

    private void releaseAudio(){
        handler.removeCallbacks(UpdateSongTime);
        mp.stop();
        mp.reset();
        mp.release();
        mp = null;
    }

    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            inicio = mp != null ? mp.getCurrentPosition() : 0;
            handler.postDelayed(this, 100);
            if(mp.getCurrentPosition() >= fin){
                btnSonido.setImageResource(R.drawable.ic_play_game_animal_sound);
                releaseAudio();
            }
        }
    };
}