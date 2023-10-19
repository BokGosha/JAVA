package ru.mirea.lab4.Clothes;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Clothes_var size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину в юбку");
    }
}