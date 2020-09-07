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
                R.drawable.info_mono, R.raw.mono, R.drawable.ic_mono, false, R.string.nombre_cientifico_mono,
                R.string.clase_mono, R.string.orden_mono, R.string.familia_mono, R.string.alimento_mono,
                R.string.habitat_mono, R.string.camada_mono, R.string.gestacion_mono);

        Animal koala = new Animal(2, R.string.nombre_koala, R.string.descripcion_koala,
                R.drawable.info_koala, R.raw.koala, R.drawable.ic_koala, false, R.string.nombre_cientifico_koala,
                R.string.clase_koala, R.string.orden_koala, R.string.familia_koala, R.string.alimento_koala,
                R.string.habitat_koala, R.string.camada_koala, R.string.gestacion_koala);

        Animal leopardo = new Animal(3, R.string.nombre_leopardo, R.string.descripcion_leopardo,
                R.drawable.info_leopardo, R.raw.leopardo, R.drawable.ic_leopardo,false, R.string.nombre_cientifico_leopardo,
                R.string.clase_leopardo, R.string.orden_leopardo, R.string.familia_leopardo, R.string.alimento_leopardo,
                R.string.habitat_leopardo, R.string.camada_leopardo, R.string.gestacion_leopardo);

        Animal caballo = new Animal(4, R.string.nombre_caballo, R.string.descripcion_caballo,
                R.drawable.info_caballo, R.raw.caballo, R.drawable.ic_caballo, false, R.string.nombre_cientifico_caballo,
                R.string.clase_caballo, R.string.orden_caballo, R.string.familia_caballo, R.string.alimento_caballo,
                R.string.habitat_caballo, R.string.camada_caballo, R.string.gestacion_caballo);

        Animal puma = new Animal(5, R.string.nombre_puma, R.string.descripcion_puma,
                R.drawable.info_puma, R.raw.puma, R.drawable.ic_puma, false, R.string.nombre_cientifico_puma,
                R.string.clase_puma, R.string.orden_puma, R.string.familia_puma, R.string.alimento_puma,
                R.string.habitat_puma, R.string.camada_puma, R.string.gestacion_puma);

        Animal jaguar = new Animal(6, R.string.nombre_jaguar, R.string.descripcion_jaguar,
                R.drawable.info_jaguar, R.raw.jaguar, R.drawable.ic_jaguar, false, R.string.nombre_cientifico_jaguar,
                R.string.clase_jaguar, R.string.orden_jaguar, R.string.familia_jaguar, R.string.alimento_jaguar,
                R.string.habitat_jaguar, R.string.camada_jaguar, R.string.gestacion_jaguar);

        Animal elefante = new Animal(7, R.string.nombre_elefante, R.string.descripcion_elefante,
                R.drawable.info_elefante, R.raw.elefante, R.drawable.ic_elefante, false, R.string.nombre_cientifico_elefante,
                R.string.clase_elefante, R.string.orden_elefante, R.string.familia_elefante, R.string.alimento_elefante,
                R.string.habitat_elefante, R.string.camada_elefante, R.string.gestacion_elefante);

        Animal leon = new Animal(8, R.string.nombre_leon, R.string.descripcion_leon,
                R.drawable.info_leon, R.raw.leon, R.drawable.ic_leon, false, R.string.nombre_cientifico_leon,
                R.string.clase_leon, R.string.orden_leon, R.string.familia_leon, R.string.alimento_leon,
                R.string.habitat_leon, R.string.camada_leon, R.string.orden_leon);

        Animal tigre = new Animal(9, R.string.nombre_tigre, R.string.descripcion_tigre,
                R.drawable.info_tigre_vengala, R.raw.tigre, R.drawable.ic_tigre, false, R.string.nombre_cientifico_tigre,
                R.string.clase_tigre, R.string.orden_tigre, R.string.familia_tigre, R.string.alimento_tigre,
                R.string.habitat_tigre, R.string.camada_tigre, R.string.gestacion_tigre);

        Animal buho = new Animal(10, R.string.nombre_buho, R.string.descripcion_buho,
                R.drawable.info_buho, R.raw.buho, R.drawable.ic_buho, false, R.string.nombre_cientifico_buho,
                R.string.clase_buho, R.string.orden_buho, R.string.familia_buho, R.string.alimento_buho,
                R.string.habitat_buho, R.string.camada_buho, R.string.gestacion_buho);

        Animal avestruz = new Animal(11, R.string.nombre_avestruz, R.string.descripcion_avestruz,
                R.drawable.info_avestruz, R.raw.avestruz, R.drawable.ic_avestruz, false, R.string.nombre_cientifico_avestruz,
                R.string.clase_avestruz, R.string.orden_avestruz, R.string.familia_avestruz, R.string.alimento_avestruz,
                R.string.habitat_avestruz, R.string.camada_avestruz, R.string.gestacion_avestruz);

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

    public String substringAnimalDescription(String descripcion, Integer finalSub){
        finalSub = finalSub <= 100 && finalSub >= 1 ? finalSub : 100;
        String shortDescription = descripcion.length() > finalSub ?
                descripcion.substring(0, finalSub):
                descripcion;
        return  shortDescription;
    }
}
