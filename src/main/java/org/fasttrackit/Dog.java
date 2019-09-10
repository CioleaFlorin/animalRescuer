package org.fasttrackit;

public class Dog extends Animal {
    String breed;

    public Dog(String name,int healthLevel, int hungryLevel, String breed) {
        super(name,healthLevel, hungryLevel);
        this.breed = breed;

    }
}

