package com.example.animalzoo.Entity;

public class Cuento {
    private Integer Id;
    private Integer Nombre;
    private Integer Cuerpo;
    private Integer Imagen;

    public Cuento(){

    }

    public Cuento(Integer id, Integer nombre, Integer cuerpo, Integer imagen) {
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

    public Integer getNombre() {
        return Nombre;
    }

    public void setNombre(Integer nombre) {
        Nombre = nombre;
    }

    public Integer getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(Integer cuerpo) {
        Cuerpo = cuerpo;
    }

    public Integer getImagen() {
        return Imagen;
    }

    public void setImagen(Integer imagen) {
        Imagen = imagen;
    }
}
