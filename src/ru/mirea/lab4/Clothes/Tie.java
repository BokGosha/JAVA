package ru.mirea.lab4.Clothes;

class Tie extends Clothes implements MenClothing {
    public Tie(Clothes_var size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в галстук");
    }
}