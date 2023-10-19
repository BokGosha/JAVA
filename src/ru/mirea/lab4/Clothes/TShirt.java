package ru.mirea.lab4.Clothes;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Clothes_var size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в футболку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину в футболку");
    }
}