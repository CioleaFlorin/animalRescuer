package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

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

    public void start() {
        initFood();
        initActivities();
        //displayFood();
        //displayAcivities();

        initAnimal();
        initAdopter();
        String name;
        name=nameAnimal();
        animal.setName(name);
        boolean animalIsOk = true;
        int roundsNumber = 1;
        while (animalIsOk == true && roundsNumber <=7) {

            System.out.println("Day "+roundsNumber + ":");

            requireFeeding();
            System.out.println();

            requireActivity();
            System.out.println();

            if(animal.getHungryLevel()>=8 | animal.getJoyLevel()<=3) {
                animalIsOk = false;
                System.out.println("Sorry! You didn't take care of " + animal.getName() + ". You lost!");
            }
            else
                animal.mood();
            roundsNumber++;
            animal.setHungryLevel(animal.getHungryLevel()+1);
            animal.setJoyLevel(animal.getJoyLevel()-1);
            System.out.println();
        }
        if(animalIsOk==true)
            System.out.println("Very well! You did a great job!");
    }



    private void initFood(){


            Food food=new Food();
            food.setName("Pedigree");
            availableFood.add(food);

            Food food1=new Food();
            food1.setName("Purina");
            availableFood.add(food1);




        }


    private void initActivities(){
        Activity activity1=new Activity("Catch");
        availableActivity[0]=activity1;

        Activity activity2=new Activity("Hide-and-seek");
        availableActivity[1]=activity2;



    }

    private void displayFood(){

        int count=1;
        for (Food food:availableFood) {

            System.out.println(count+"."+food.getName());
            count++;
        }
        System.out.println(count+".I don't want to feed "+ animal.getName()+" today.");
    }

    private void displayAcivities(){
        for(int i=0; i< availableActivity.length;i++)
            System.out.println((i+1)+ "." + availableActivity[i].getName());
        System.out.println((availableActivity.length+1) +".I don t want to play with "+ animal.getName());

    }


    private  void initAnimal(){
        animal=new Dog("-",8,3,"Canine","Pitbull");
        animal.setFavouriteFood("Pedigree");
        animal.setFavouriteActivity("catch");
        animal.setAge(2);
        animal.setJoyLevel(6);

    }

    private String initAdopter(){
        System.out.println("Please enter your name.");
        String name;
        Scanner scanner=new Scanner(System.in);
        name=scanner.nextLine();
        if(Pattern.matches("[a-zA-z]+",name))
            return name;
        else{
            System.out.println("Please enter a valid name!");
            return initAdopter();
        }

    }

    private String nameAnimal(){
        System.out.println("Please enter your animal's name");
        String name;
        Scanner scanner=new Scanner(System.in);
        name=scanner.nextLine();
        if(Pattern.matches("[a-zA-z]+",name))
            return name;
        else{
            System.out.println("Please enter a valid name!");
            return nameAnimal();
        }



    }

    private void requireFeeding() {


            System.out.println("What do you want to feed " + animal.getName() + " ?");
            displayFood();
            int foodNumber = getActivityFromUser();
            if(foodNumber==3)
            {
                animal.setHungryLevel(animal.getHungryLevel()+1);
                System.out.println(animal.getName()+ " new hungry level is "+ animal.getHungryLevel());
            }
            else{
                try {
                    adopter.feed(animal, availableFood.get(foodNumber - 1));
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Choose a valid option, please!");
                    requireFeeding();
                }
            }
        }


    private void requireActivity(){
        System.out.println("What do you want to play with " + animal.getName()+ "?");
        displayAcivities();
        int activityNumber=getActivityFromUser();
        if(activityNumber==3)
        {
            animal.setJoyLevel(animal.getJoyLevel()-1);
            System.out.println(animal.getName()+ " new joy level is "+ animal.getJoyLevel());
        }
        else{
            try {
                adopter.play(animal, availableActivity[activityNumber - 1]);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Choose a valid option, please!");
                requireActivity();
            }
        }
    }







    private int getActivityFromUser(){
        Scanner scanner=new Scanner(System.in);
            try{
                    return scanner.nextInt();
            }

            catch (InputMismatchException | IndexOutOfBoundsException e){

                System.out.println("Pick a valid number, please!");
                return getActivityFromUser();
        }
    }

}


