package org.fasttrackit;

public class Game {
    private Adopter adopter;
    private Animal animal;
    private Vet vet;

    public Game(Adopter adopter, Animal animal, Vet vet) {
        this.adopter = adopter;
        this.animal = animal;
        this.vet = vet;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
