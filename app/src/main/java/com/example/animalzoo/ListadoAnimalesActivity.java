package com.example.animalzoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.animalzoo.Adapters.AnimalesAdapter;
import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.Services.AnimalService;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class ListadoAnimalesActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyclerView;
    private AnimalesAdapter animalesAdapter;
    private IAnimalService animalService;
    private ArrayList<Animal> animales;
    private Switch swTipoSangre;
    private ScrollView linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_animales);

        animalService = new AnimalService();
        animales = animalService.hotBloodAnimalsList();
        linearLayout = findViewById(R.id.layoutVacio);
        swTipoSangre = findViewById(R.id.swTipoSangre);
        recyclerView = findViewById(R.id.rvAnimales);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalesAdapter = new AnimalesAdapter();
        animalesAdapter.setData(animales, animalService);

        AlphaInAnimationAdapter alphaInAnimationAdapter = new AlphaInAnimationAdapter(animalesAdapter);
        alphaInAnimationAdapter.setDuration(1000);
        alphaInAnimationAdapter.setInterpolator(new OvershootInterpolator());
        alphaInAnimationAdapter.setFirstOnly(false);
        recyclerView.setAdapter(new ScaleInAnimationAdapter(alphaInAnimationAdapter));


        animalesAdapter.setOnclicListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int animalPosition = animales.get(recyclerView.getChildAdapterPosition(view)).getId() - 1;
                Intent intent = new Intent(ListadoAnimalesActivity.this, InformacionAnimalesActivity.class);
                intent.putExtra("animalPosition", animalPosition);
                startActivity(intent);
            }
        });
        swTipoSangre.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.swTipoSangre:{
                if(swTipoSangre.isChecked()){
                    animales = animalService.coldBloodAnimalsList();
                    swTipoSangre.setText("Frios");
                }else{
                    animales = animalService.hotBloodAnimalsList();
                    swTipoSangre.setText("Calientes");
                }
                linearLayout.setVisibility(animales.size()>0 ? View.GONE : View.VISIBLE);
                animalesAdapter.setData(animales, animalService);
                recyclerView.setAdapter(animalesAdapter);
            }
        }
    }
}