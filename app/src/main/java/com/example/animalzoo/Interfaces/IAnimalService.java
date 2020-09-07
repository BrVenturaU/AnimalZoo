package com.example.animalzoo.Interfaces;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Utils.AnimalType;

import java.util.ArrayList;
import java.util.List;

public interface IAnimalService {
    ArrayList<Animal> listOfAnimals();
    String substringAnimalDescription(String descripcion, Integer finalSub);
    ArrayList<Animal> coldBloodAnimalsList();
    ArrayList<Animal> hotBloodAnimalsList();
    AnimalType coldBloodAnimalCount();
}
