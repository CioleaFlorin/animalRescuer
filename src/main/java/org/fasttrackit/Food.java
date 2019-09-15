package org.fasttrackit;

import java.time.LocalDate;

public class Food {
    private String name;
    private int price;
    private LocalDate expirationDate;
    private boolean inStoc;

    public Food(String name, LocalDate expirationDate, boolean inStoc) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.inStoc = inStoc;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
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
