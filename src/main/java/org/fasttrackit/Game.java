package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    private Adopter adopter;
    private Animal animal;
    private Vet vet;
    private List <Food> availableFood= new ArrayList<>();
    private Activity[] availableActivity= new Activity[2];

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

    public void start(){
        initFood();
        initActivities();
        displayFood();
        displayAcivities();
    }

    private void initFood(){

        int foodTypes=2;
        for(int i=1;i<=foodTypes;i++){
            Food food=new Food();
            food.setName("Food "+i);

            availableFood.add(food);

        }
    }

    private void initActivities(){
        for( int i=0; i< availableActivity.length; i++){
            Activity activity=new Activity("Activity "+(i+1));
            availableActivity[i]=activity;

        }

    }

    private void displayFood(){

        for (Food food:availableFood) {

            System.out.println(food.getName());
            
        }
    }

    private void displayAcivities(){
        for(int i=0; i< availableActivity.length;i++)
            System.out.println(availableActivity[i].getName());

    }

}
