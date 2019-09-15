package org.fasttrackit;

public class Dog extends Mammal {
    private String breed;


    public Dog(String name, int healthLevel, int hungryLevel, String species, String breed) {
        super(name, healthLevel, hungryLevel, species);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void mood() {
        if (getJoyLevel()>4 )
            System.out.println(getName()+ " is happy, it wags his tail");
        else
            System.out.println(getName()+ " is sad, it sleeps all day");
    }
}

