package com.example.animalzoo.Entity;

import android.graphics.drawable.Icon;

import com.example.animalzoo.R;

import java.util.ArrayList;

public class Animal {
    private Integer Id;
    private Integer Nombre;
    private Integer Descripcion;
    private Integer Imagen;
    private Integer Audio;
    private Integer Icono;
    private Boolean IsColdBlood;

    public Animal() {
    }

    public Animal(Integer id, Integer nombre, Integer descripcion, Integer imagen, Integer audio, Integer icono,Boolean isColdBlood) {
        Id = id;
        Nombre = nombre;
        Descripcion = descripcion;
        Imagen = imagen;
        Audio = audio;
        Icono = icono;
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

    public Integer getIcono(){return Icono;}

    public void setIcono(Integer icono){
        Icono = icono;
    }
}
