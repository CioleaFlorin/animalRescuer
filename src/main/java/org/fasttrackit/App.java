package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Animal animal= new Animal("Rex", 7,5);
       //animal.name="Rex";
       //animal.age=7;
       //animal.joyLevel=5;
       //animal.favouriteActivity="swimming";
       //animal.favouriteFood="Pedigree";
       //animal.healthLevel=10;
       //animal.hungryLevel=2;

        animal.setAge(7);
        animal.setFavouriteActivity("swimming");


        Adopter adopter=new Adopter("John");
        //adopter.name="John";
        //adopter.cashAvailable=1000;
        adopter.setCashAvailable(1200);

        LocalDate newExpirationDate=LocalDate.of(2023,5,6);
        Food food=new Food("Pedigree", newExpirationDate, true );
       //food.name="Pedigree";
       //food.price=23;
       //food.inStoc=true;
        food.setExpirationDate(newExpirationDate);
        System.out.println(food.getExpirationDate());

        Activity activity=new Activity("catch");
        //activity.name="swimming";

        Vet vet=new Vet("Frank");
       //vet.name="Frank";
       //vet.specialization="Canine";
        vet.setSpecialization("Canine");


        Game game=new Game(adopter,animal,vet);
        //game.adopter=adopter;
        //game.dog=animal;
        //game.vet=vet;
        game.setAdopter(adopter);

        //adopter.feed(animal, food);
        //System.out.println(animal.getHungryLevel());


        //adopter.play(animal,activity);
        //System.out.println(animal.getJoyLevel());



    }
}