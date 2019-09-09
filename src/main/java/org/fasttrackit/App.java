package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.name="dog";
        animal.age=7;
        animal.joyLevel=5;
        animal.favouriteActivity="swimming";
        animal.favouriteFood="Pedigree";
        animal.healthLevel=10;
        animal.hungryLevel=2;



        Adopter adopter=new Adopter();
        adopter.name="John";
        adopter.cashAvailable=1000;

        Food food=new Food();
        food.name="Pedigree";
        food.price=23;
        food.inStoc=true;

        Activity activity=new Activity();
        activity.name="swimming";

        Vet vet=new Vet();
        vet.name="Frank";
        vet.specialization="Canine";


        Game game=new Game();
        game.adopter=adopter;
        game.dog=animal;
        game.vet=vet;



    }
}