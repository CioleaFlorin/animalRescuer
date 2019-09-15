package org.fasttrackit;

public class Adopter {
    private String name;
    private int cashAvailable;

    public Adopter(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCashAvailable(int cashAvailable) {
        this.cashAvailable = cashAvailable;
    }


    public void feed(Animal animal, Food food){

        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName() );

        animal.setHungryLevel(animal.getHungryLevel()-2);
    }

    public void play(Animal animal, Activity activity){
        System.out.println(name + " is playing " + activity.getName() + " with " + animal.getName());
        animal.setJoyLevel(animal.getJoyLevel()+3);
    }
}
