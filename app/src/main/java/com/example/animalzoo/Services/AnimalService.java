package com.example.animalzoo.Services;

import android.text.BoringLayout;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.R;
import com.example.animalzoo.Utils.AnimalType;

import java.util.ArrayList;
import java.util.List;

public class AnimalService implements IAnimalService {
    public AnimalService(){

    }

    @Override
    public ArrayList<Animal> listOfAnimals(){
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

        Animal camaleon = new Animal(12, R.string.nombre_camaleon, R.string.descripcion_camaleon,
                R.drawable.info_camaleon, R.raw.camaleon, R.drawable.ic_camaleon, true, R.string.nombre_cientifico_camaleon,
                R.string.clase_camaleon, R.string.orden_camaleon, R.string.familia_camaleon, R.string.alimento_camaleon,
                R.string.habitat_camaleon, R.string.camada_camaleon, R.string.gestacion_camaleon);

        Animal cocodrilo = new Animal(13, R.string.nombre_cocodrilo, R.string.descripcion_cocodrilo,
                R.drawable.info_cocodrilo, R.raw.cocodrilo, R.drawable.ic_cocodrilo, true, R.string.nombre_cientifico_cocodrilo,
                R.string.clase_cocodrilo, R.string.orden_cocodrilo, R.string.familia_cocodrilo, R.string.alimento_cocodrilo,
                R.string.habitat_cocodrilo, R.string.camada_cocodrilo, R.string.gestacion_cocodrilo);

        Animal tiburon = new Animal(14, R.string.nombre_tiburon, R.string.descripcion_tiburon,
                R.drawable.info_tiburon, R.raw.tiburon, R.drawable.ic_tiburon, true, R.string.nombre_cientifico_tiburon,
                R.string.clase_tiburon, R.string.orden_tiburon, R.string.familia_tiburon, R.string.alimento_tiburon,
                R.string.habitat_tiburon, R.string.camada_tiburon, R.string.gestacion_tiburon);

        Animal rana = new Animal(15, R.string.nombre_rana, R.string.descripcion_rana,
                R.drawable.info_rana, R.raw.rana, R.drawable.ic_rana, true, R.string.nombre_cientifico_rana,
                R.string.clase_rana, R.string.orden_rana, R.string.familia_rana, R.string.alimento_rana,
                R.string.habitat_rana, R.string.camada_rana, R.string.gestacion_rana);

        Animal tortuga = new Animal(16, R.string.nombre_tortuga, R.string.descripcion_tortuga,
                R.drawable.info_tortuga, R.raw.tortuga, R.drawable.ic_tortuga, true, R.string.nombre_cientifico_tortuga,
                R.string.clase_tortuga, R.string.orden_tortuga, R.string.familia_tortuga, R.string.alimento_tortuga,
                R.string.habitat_tortuga, R.string.camada_tortuga, R.string.gestacion_tortuga);

        //Agregando animales a la lista
        ArrayList<Animal> Animales = new ArrayList<>();
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
        Animales.add(camaleon);
        Animales.add(cocodrilo);
        Animales.add(tiburon);
        Animales.add(rana);
        Animales.add(tortuga);

        return Animales;
    }

    public ArrayList<Animal> coldBloodAnimalsList(){
        ArrayList<Animal> animales = listOfAnimals();
        ArrayList<Animal> coldBloodAnimals = new ArrayList<>();
        for (Animal animal : animales){
            if(animal.getIsColdBlood())
                coldBloodAnimals.add(animal);
        }
        return coldBloodAnimals;
    }

    public ArrayList<Animal> hotBloodAnimalsList(){
        ArrayList<Animal> animales = listOfAnimals();
        ArrayList<Animal> hotBloodAnimals = new ArrayList<>();
        for (Animal animal : animales){
            if(!animal.getIsColdBlood())
                hotBloodAnimals.add(animal);
        }

        return hotBloodAnimals;
    }

    public String substringAnimalDescription(String descripcion, Integer finalSub){
        finalSub = finalSub <= 100 && finalSub >= 1 ? finalSub : 100;
        String shortDescription = descripcion.length() > finalSub ?
                descripcion.substring(0, finalSub)+"...":
                descripcion;
        return  shortDescription;
    }

    public AnimalType coldBloodAnimalCount(){
        AnimalType animalType;
        Integer coldCount = 0, hotCount = 0;
        List<Animal> animales = listOfAnimals();
        for (Animal animal : animales){
            if(animal.getIsColdBlood())
                coldCount++;
            else
                hotCount++;
        }

        animalType = new AnimalType(coldCount, hotCount);

        return animalType;
    }
}
