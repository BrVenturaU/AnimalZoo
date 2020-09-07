package com.example.animalzoo.Entity;

public class Animal {
    private Integer Id;
    private String Nombre;
    private String Descripcion;
    private Integer Imagen;
    private Integer Audio;

    public Animal() {
    }

    public Animal(Integer id, String nombre, String descripcion, Integer imagen, Integer audio) {
        Id = id;
        Nombre = nombre;
        Descripcion = descripcion;
        Imagen = imagen;
        Audio = audio;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
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
}
