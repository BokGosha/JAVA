package ru.mirea.lab4.Clothes;

public class Atelier {
    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Одежда для женщин:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) item;
                womenClothing.dressWoman();
                System.out.println("Размер: " + item.getSize());
                System.out.println("Стоимость: $" + item.getCost());
                System.out.println("Цвет: " + item.getColor());
                System.out.println("--------------------");
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Одежда для мужчин:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) item;
                menClothing.dressMan();
                System.out.println("Размер: " + item.getSize());
                System.out.println("Стоимость: $" + item.getCost());
                System.out.println("Цвет: " + item.getColor());
                System.out.println("--------------------");
            }
        }
    }
}