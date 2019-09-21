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
        //System.out.println(food.getExpirationDate());

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
        //System.out.println("After feeding, " +  animal.getName()+ "'s hungry level is "  +animal.getHungryLevel());

        //adopter.play(animal,activity);
        //System.out.println("After playing, " +  animal.getName()+ "'s joy level is "  +animal.getJoyLevel());


        //animal.setJoyLevel(7);
        //animal.mood();
//
        Animal dog= new Dog("Rex",9,3,"Canine","Bulldog");
        dog.setJoyLevel(7);
        dog.mood();

        Mammal mammal=new Dog("Bruno", 10,5,"Canine","Pitbull");
        mammal.setJoyLevel(2);
        mammal.mood();

        Animal mammal2=new Mammal("Hugo", 10,5,"Canine");
        mammal2.mood();









    }
}