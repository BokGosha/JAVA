package ru.mirea.lab4.Clothes;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Clothes_var size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину в штаны");
    }
}