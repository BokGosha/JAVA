package ru.mirea.lab4.Clothes;

public abstract class Clothes {
    private Clothes_var size;
    private double cost;
    private String color;

    Clothes(Clothes_var size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Clothes_var getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}