package com.example.animalzoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttoListado = (Button) findViewById(R.id.btnListado);
        Button buttonJugar = (Button) findViewById(R.id.btnJugar);


        //Activity Listado
        buttoListado.setOnClickListener(HomeActivity.this);

        //Activity Juego
        buttonJugar.setOnClickListener(HomeActivity.this);
    }


    //Instrucciones del Menu de Opciones: Informacion/Salir
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.Informacion:
                intent= new Intent(this, InformacionActivity.class);
                startActivity(intent);
                break;
            case R.id.Salir:
                System.exit(0);
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnListado:{
                intent = new Intent(HomeActivity.this, ListadoAnimalesActivity.class);
                break;
            }

            case R.id.btnJugar:{
                intent = new Intent(HomeActivity.this, JuegoActivity.class);
                break;
            }
        }
        startActivity(intent);
    }
}