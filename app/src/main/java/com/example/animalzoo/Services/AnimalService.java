package com.example.animalzoo.Services;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.R;

import java.util.ArrayList;
import java.util.List;

public class AnimalService implements IAnimalService {
    public AnimalService(){

    }

    @Override
    public List<Animal> listOfAnimals(){
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
        List<Animal> Animales = new ArrayList<>();
        Animales.add(mono);
        Animales.add(koala);
        Animales.add(leopardo);
        Animales.add(caballo);
        Animales.add(puma);
        Animales.add(jaguar);
        Animales.add(elefante);
        Animales.add(leon);
        Animales.add(tigre);
        Animales.add(buho);
        Animales.add(avestruz);

        return Animales;



    }
}
