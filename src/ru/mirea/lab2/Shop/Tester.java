package ru.mirea.lab2.Shop;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");

        int n = sc.nextInt();

        Shop shop = new Shop(n);

        shop.addComputer();
        shop.deleteComputer(1);

        System.out.println(shop.findComputer(0));
        System.out.println(shop);
    }
}