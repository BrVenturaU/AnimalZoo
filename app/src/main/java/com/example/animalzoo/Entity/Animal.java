package com.example.animalzoo.Entity;

import com.example.animalzoo.R;

import java.util.ArrayList;

public class Animal {
    private Integer Id;
    private Integer Nombre;
    private Integer Descripcion;
    private Integer Imagen;
    private Integer Audio;
    private Boolean IsColdBlood;

    public Animal() {
    }

    public Animal(Integer id, Integer nombre, Integer descripcion, Integer imagen, Integer audio, Boolean isColdBlood) {
        Id = id;
        Nombre = nombre;
        Descripcion = descripcion;
        Imagen = imagen;
        Audio = audio;
        IsColdBlood = isColdBlood;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNombre() {
        return Nombre;
    }

    public void setNombre(Integer nombre) {
        Nombre = nombre;
    }

    public Integer getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(Integer descripcion) {
        Descripcion = descripcion;
    }

    public Integer getImagen() {
        return Imagen;
    }

    public void setImagen(Integer imagen) {
        Imagen = imagen;
    }

    public Integer getAudio() {
        return Audio;
    }

    public void setAudio(Integer audio) {
        Audio = audio;
    }

    public Boolean getIsColdBlood(){
        return IsColdBlood;
    }

    public void setIsColdBlood(Boolean isColdBlood){
        IsColdBlood = isColdBlood;
    }

    public ArrayList<Animal> listOfAnimals(){
        //Creando Animales
        Animal mono = new Animal(1, R.string.nombre_mono_araña, R.string.descripcion_mono_araña,
                R.drawable.mono, R.raw.mono, false);
        Animal koala = new Animal(2, R.string.nombre_koala, R.string.descripcion_koala,
                R.drawable.koala, R.raw.koala, false);
        Animal leopardo = new Animal(3, R.string.nombre_leopardo, R.string.descripcion_leopardo,
                R.drawable.leopardo, R.raw.leopardo, false);
        Animal caballo = new Animal(4, R.string.nombre_caballo, R.string.descripcion_caballo,
                R.drawable.caballo, R.raw.caballo, false);
        Animal puma = new Animal(5, R.string.nombre_puma, R.string.descripcion_puma,
                R.drawable.puma, R.raw.puma, false);
        Animal jaguar = new Animal(6, R.string.nombre_jaguar, R.string.descripcion_jaguar,
                R.drawable.jaguar, R.raw.jaguar, false);
        Animal elefante = new Animal(7, R.string.nombre_elefante, R.string.descripcion_elefante,
                R.drawable.elefante, R.raw.elefante, false);
        Animal leon = new Animal(8, R.string.nombre_leon, R.string.descripcion_leon,
                R.drawable.leon, R.raw.leon, false);
        Animal tigre = new Animal(9, R.string.nombre_tigre, R.string.descripcion_tigre,
                R.drawable.tigre_vengala, R.raw.tigre, false);
        Animal buho = new Animal(10, R.string.nombre_buho, R.string.descripcion_buho,
                R.drawable.buho, R.raw.buho, false);
        Animal avestruz = new Animal(11, R.string.nombre_avestruz, R.string.descripcion_avestruz,
                R.drawable.avestruz, R.raw.avestruz, false);

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
