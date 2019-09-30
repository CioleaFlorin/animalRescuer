package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
        nameAnimal();

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
            animal.setJoyLevel((animal.getJoyLevel()-1));
            animal.setHungryLevel((animal.getHungryLevel()+1));
            roundsNumber++;
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
    }

    private void displayAcivities(){
        for(int i=0; i< availableActivity.length;i++)
            System.out.println((i+1)+ "." + availableActivity[i].getName());

    }


    private  void initAnimal(){
        animal=new Dog("-",8,3,"Canine","Pitbull");
        animal.setFavouriteFood("Pedigree");
        animal.setFavouriteActivity("catch");
        animal.setAge(2);
        animal.setJoyLevel(6);

    }

    private void initAdopter(){
        System.out.println("Please enter your name.");
        Scanner scanner=new Scanner(System.in);
        try{
            adopter.setName(scanner.nextLine());
        }
        catch (InputMismatchException e){
            System.out.println("You entered an invalid name.");
            initAdopter();
        }

    }

    private void nameAnimal(){
        System.out.println("Please enter your animal's name");
        Scanner scanner=new Scanner(System.in);
        animal.setName(scanner.nextLine());
    }

    private void requireFeeding() {

        System.out.println("Do you want to feed " + animal.getName() + " ?");
        Scanner yesNo = new Scanner(System.in);
        if (yesNo.next().equals("no") )
            System.out.println(animal.getName() + " hungry level is " + animal.getHungryLevel());
        else {
            System.out.println("What do you want to feed " + animal.getName() + " ?");
            displayFood();
            Scanner scanner = new Scanner(System.in);
            int foodNumber = scanner.nextInt();
            adopter.feed(animal, availableFood.get(foodNumber-1));
        }

    }

    private void requireActivity(){

        System.out.println("Do you want to play with " + animal.getName() + " ?");
        Scanner yesNo=new Scanner(System.in);
        if(yesNo.next().equals("no")){
            System.out.println(animal.getName() + "'s  joy level is " + animal.getJoyLevel());
        }
        else{

        System.out.println("What do you want to play with " + animal.getName() + " ?");
        displayAcivities();

        Scanner scanner=new Scanner(System.in);
        int activityNumber=scanner.nextInt();

        adopter.play(animal,availableActivity[activityNumber-1]);

    }

    }


    }
