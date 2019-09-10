package org.fasttrackit;

public class Mammal extends Animal {
    String species;

    public Mammal(String name,  int healthLevel, int hungryLevel, String species) {
        super(name,healthLevel, hungryLevel);
        this.species = species;
    }
}
