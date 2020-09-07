package com.example.animalzoo.Interfaces;

import com.example.animalzoo.Entity.Animal;

import java.util.List;

public interface IAnimalService {
    List<Animal> listOfAnimals();
    String substringAnimalDescription(String descripcion, Integer finalSub);
}
