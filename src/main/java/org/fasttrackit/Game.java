package org.fasttrackit;

public class Game {
    Adopter adopter;
    Animal animal;
    Vet vet;

    public Game(Adopter adopter, Animal animal, Vet vet) {
        this.adopter = adopter;
        this.animal = animal;
        this.vet = vet;
    }
}
