package com.example.animalzoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.animalzoo.Adapters.AnimalesAdapter;
import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.Services.AnimalService;

import java.util.List;

public class ListadoAnimalesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AnimalesAdapter animalesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_animales);

        recyclerView = findViewById(R.id.rvAnimales);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalesAdapter = new AnimalesAdapter();
        animalesAdapter.setData();

        animalesAdapter.setOnclicListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Información Activity", Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(animalesAdapter);



    }
}