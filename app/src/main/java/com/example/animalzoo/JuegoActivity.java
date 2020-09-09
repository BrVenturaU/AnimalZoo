package com.example.animalzoo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.Services.AnimalService;

import java.util.Random;

public class JuegoActivity extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer mp;
    private IAnimalService animalService;
    private TextView txtPuntos,txtTiempo,txtVidas,txtResultado;
    private ImageView imgAnimal;
    private EditText etNombreAnimal;
    private Button btnConfirmar;
    private ImageButton btnSonido;

    private String []nombre_Animals={"avestruz","buho","caballo","elefante","jaguar","koala","leon","leopardo","mono","puma","tigre"};
    private String []imagen_Animals={"avestruz","buho","caballo","elefante","jaguar","koala","leon","leopardo","mono","puma","tigre"};

    private Integer intPuntos = 0;
    private Integer intVidas = 5;
    private Integer numerGene = 0;
    private Integer randomNumber;
    private Animal animal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        animalService = new AnimalService();
        Random random = new Random();
        randomNumber = random.nextInt(animalService.getItemCount());
        animal = animalService.listOfAnimals().get(randomNumber);

        txtPuntos = findViewById(R.id.txtPuntos);
        txtVidas = findViewById(R.id.txtVidas);
        imgAnimal = findViewById(R.id.imgAnimal);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        txtResultado = findViewById(R.id.txtResultado);
        btnSonido = findViewById(R.id.btnSonido);
        etNombreAnimal = findViewById(R.id.etNombreAnimal);

        mp = MediaPlayer.create(this, animal.getAudio());
        btnSonido.setOnClickListener(this);
        btnConfirmar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnConfirmar:{
                String nombreMinuscula = etNombreAnimal.getText().toString().toLowerCase();
                String nombreMayuscula = etNombreAnimal.getText().toString().toUpperCase();
                String

                if(nombreMayuscula.equals(animal.getNombre()) || nombreMinuscula.equals(animal.getNombre())){
                    txtResultado.setText("¡Has acertado!");
                    txtResultado.setVisibility(View.VISIBLE);
                    intPuntos=intPuntos+1;
                    txtPuntos.setText(intPuntos.toString());
                    esperar1();
                }
                else {
                    txtResultado.setText("¡Te has equivocado!");
                    txtResultado.setVisibility(View.VISIBLE);
                    intVidas=intVidas-1;
                    txtVidas.setText(intVidas.toString());
                    esperar2();
                }
                if(intVidas==0){
                    finish();
                }
            }
            case R.id.btnSonido:{
                mp.start();
            }
        }
    }

    void esperar2() {
        new CountDownTimer(2000,1) {
            @Override
            public void onTick(long millisUntilFinished) {
                btnConfirmar.setVisibility(View.GONE);
            }
            @Override
            public void onFinish() {
                btnConfirmar.setVisibility(View.VISIBLE);
                txtResultado.setVisibility(View.INVISIBLE);
                etNombreAnimal.setText("");
                etNombreAnimal.setHint("Ingrese el nombre de el animal");
            }
        }.start();
    }
    void esperar1(){
        new CountDownTimer(4000,1) {
            @Override
            public void onTick(long millisUntilFinished) {
                btnConfirmar.setVisibility(View.GONE);
                txtTiempo.setText(""+(millisUntilFinished/1000 +1));
            }
            @Override
            public void onFinish() {
                btnConfirmar.setVisibility(View.VISIBLE);
                numerGene=numerGene+1;
                txtTiempo.setText("");
                establecer_imagen(numerGene);
                txtResultado.setVisibility(View.INVISIBLE);
                etNombreAnimal.setText("");
                etNombreAnimal.setHint("Ingrese el nombre de el animal");
            }
        }.start();


    }
    void establecer_imagen(int numero){
        int id = getResources().getIdentifier(imagen_Animals[numero],"mipmap",getPackageName());
        imgAnimal.setImageResource(id);
    }
}