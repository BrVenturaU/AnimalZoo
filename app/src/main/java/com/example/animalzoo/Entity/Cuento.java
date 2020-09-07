package com.example.animalzoo.Entity;

public class Cuento {
    private Integer Id;
    private String Nombre;
    private String Cuerpo;
    private Integer Imagen;

    public Cuento(){

    }

    public Cuento(Integer id, String nombre, String cuerpo, Integer imagen) {
        Id = id;
        Nombre = nombre;
        Cuerpo = cuerpo;
        Imagen = imagen;
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

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        Cuerpo = cuerpo;
    }

    public Integer getImagen() {
        return Imagen;
    }

    public void setImagen(Integer imagen) {
        Imagen = imagen;
    }
}
