package org.fasttrackit;

public class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungryLevel;
    private int joyLevel;
    private String favouriteFood;
    private String favouriteActivity;

    public Animal(String name, int healthLevel, int hungryLevel) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.hungryLevel = hungryLevel;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public void setJoyLevel(int joyLevel) {
        this.joyLevel = joyLevel;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public int getJoyLevel() {
        return joyLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }
}
