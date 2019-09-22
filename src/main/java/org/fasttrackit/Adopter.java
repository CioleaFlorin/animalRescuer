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

        boolean gotFavouriteFood=false;
        if(food.getName()==animal.getFavouriteFood()){
            animal.setJoyLevel(animal.getJoyLevel()+1);
            gotFavouriteFood=true;}

        animal.setHungryLevel(animal.getHungryLevel()-1);
        System.out.println("Hungry level: "+ animal.getHungryLevel());

        if(gotFavouriteFood==true)
            System.out.println("Got favourite food, new joy level: "+ animal.getJoyLevel());
    }

    public void play(Animal animal, Activity activity){

        System.out.println(name + " is playing " + activity.getName() + " with " + animal.getName());

        if(activity.getName()==animal.getFavouriteActivity())
            animal.setJoyLevel(animal.getJoyLevel()+2);
        else
            animal.setJoyLevel(animal.getJoyLevel()+1);

        System.out.println("New joy level: "+animal.getJoyLevel());


    }
}
