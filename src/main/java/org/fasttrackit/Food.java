package org.fasttrackit;

public class Food {
    private String name;
    private int price;
    private boolean inStoc;

    public Food(String name, boolean inStoc) {
        this.name = name;

        this.inStoc = inStoc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInStoc(boolean inStoc) {
        this.inStoc = inStoc;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isInStoc() {
        return inStoc;
    }
}
