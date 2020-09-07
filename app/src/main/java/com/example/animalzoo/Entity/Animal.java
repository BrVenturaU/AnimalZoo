package com.example.animalzoo.Entity;

import android.graphics.drawable.Icon;

import com.example.animalzoo.R;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Animal {
    private Integer Id;
    private Integer Nombre;
    private Integer Descripcion;
    private Integer Imagen;
    private Integer Audio;
    private Integer Icono;
    private Boolean IsColdBlood;
    private Integer NombreCientifico;
    private Integer Clase;
    private Integer Orden;
    private Integer Familia;
    private Integer Alimento;
    private Integer Habitat;
    private Integer Camada;
    private Integer Gestacion;

    public Animal(Integer id, Integer nombre, Integer descripcion, Integer imagen, Integer audio, Integer icono,
                  Boolean isColdBlood, Integer nombreCientifico, Integer clase, Integer orden, Integer familia,
                  Integer alimento, Integer habitat, Integer camada, Integer gestacion) {
        Id = id;
        Nombre = nombre;
        Descripcion = descripcion;
        Imagen = imagen;
        Audio = audio;
        Icono = icono;
        IsColdBlood = isColdBlood;
        NombreCientifico = nombreCientifico;
        Clase = clase;
        Orden = orden;
        Familia = familia;
        Alimento = alimento;
        Habitat = habitat;
        Camada = camada;
        Gestacion = gestacion;
    }

    public Animal() {
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

    public Integer getNombreCientifico() {
        return NombreCientifico;
    }

    public void setNombreCientifico(Integer nombreCientifico) {
        NombreCientifico = nombreCientifico;
    }

    public Integer getClase() {
        return Clase;
    }

    public void setClase(Integer clase) {
        Clase = clase;
    }

    public Integer getOrden() {
        return Orden;
    }

    public void setOrden(Integer orden) {
        Orden = orden;
    }

    public Integer getFamilia() {
        return Familia;
    }

    public void setFamilia(Integer familia) {
        Familia = familia;
    }

    public Integer getAlimento() {
        return Alimento;
    }

    public void setAlimento(Integer alimento) {
        Alimento = alimento;
    }

    public Integer getHabitat() {
        return Habitat;
    }

    public void setHabitat(Integer habitat) {
        Habitat = habitat;
    }

    public Integer getCamada() {
        return Camada;
    }

    public void setCamada(Integer camada) {
        Camada = camada;
    }

    public Integer getGestacion() {
        return Gestacion;
    }

    public void setGestacion(Integer gestacion) {
        Gestacion = gestacion;
    }
}
