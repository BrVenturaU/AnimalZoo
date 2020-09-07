package com.example.animalzoo.Services;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.R;

import java.util.ArrayList;

public class AnimalService implements IAnimalService {
    public AnimalService(){

    }

    @Override
    public ArrayList<Animal> listOfAnimals(){
        //Creando Animales
        Animal mono = new Animal(1, R.string.nombre_mono_araña, R.string.descripcion_mono_araña,
                R.drawable.info_mono, R.raw.mono, R.drawable.ic_mono, false);
        Animal koala = new Animal(2, R.string.nombre_koala, R.string.descripcion_koala,
                R.drawable.info_koala, R.raw.koala, R.drawable.ic_koala, false);
        Animal leopardo = new Animal(3, R.string.nombre_leopardo, R.string.descripcion_leopardo,
                R.drawable.info_leopardo, R.raw.leopardo, R.drawable.ic_leopardo,false);
        Animal caballo = new Animal(4, R.string.nombre_caballo, R.string.descripcion_caballo,
                R.drawable.info_caballo, R.raw.caballo, R.drawable.ic_caballo, false);
        Animal puma = new Animal(5, R.string.nombre_puma, R.string.descripcion_puma,
                R.drawable.info_puma, R.raw.puma, R.drawable.ic_puma, false);
        Animal jaguar = new Animal(6, R.string.nombre_jaguar, R.string.descripcion_jaguar,
                R.drawable.info_jaguar, R.raw.jaguar, R.drawable.ic_jaguar, false);
        Animal elefante = new Animal(7, R.string.nombre_elefante, R.string.descripcion_elefante,
                R.drawable.info_elefante, R.raw.elefante, R.drawable.ic_elefante, false);
        Animal leon = new Animal(8, R.string.nombre_leon, R.string.descripcion_leon,
                R.drawable.info_leon, R.raw.leon, R.drawable.ic_leon, false);
        Animal tigre = new Animal(9, R.string.nombre_tigre, R.string.descripcion_tigre,
                R.drawable.info_tigre_vengala, R.raw.tigre, R.drawable.ic_tigre, false);
        Animal buho = new Animal(10, R.string.nombre_buho, R.string.descripcion_buho,
                R.drawable.info_buho, R.raw.buho, R.drawable.ic_buho, false);
        Animal avestruz = new Animal(11, R.string.nombre_avestruz, R.string.descripcion_avestruz,
                R.drawable.info_avestruz, R.raw.avestruz, R.drawable.ic_avestruz, false);

        //Agregando animales a la lista
        ArrayList<Animal> Animales = new ArrayList<>();
        Animales.add(0, mono);
        Animales.add(1, koala);
        Animales.add(2, leopardo);
        Animales.add(3, caballo);
        Animales.add(4, puma);
        Animales.add(5, jaguar);
        Animales.add(6, elefante);
        Animales.add(7, leon);
        Animales.add(8, tigre);
        Animales.add(9, buho);
        Animales.add(10, avestruz);

        return Animales;



    }
}
