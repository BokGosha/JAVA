package ru.mirea.lab4.Clothes;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Clothes_var.S, 20.99, "Red"),
                new Pants(Clothes_var.M, 39.99, "Blue"),
                new Skirt(Clothes_var.XXS, 29.99, "Black"),
                new Tie(Clothes_var.L, 15.99, "Gray")
        };

        Atelier.dressWoman(clothes);
        System.out.println();
        Atelier.dressMan(clothes);
    }
}