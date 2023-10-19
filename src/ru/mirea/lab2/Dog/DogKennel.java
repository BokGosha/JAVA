package ru.mirea.lab2.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    private static ArrayList<Dog> dogs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество собак: ");

        int n = sc.nextInt();
        dogs = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите кличку и возраст %1$d-й собаки: ", i + 1);
            dogs.add(new Dog(sc.next(), sc.nextInt()));
        }

        System.out.println(dogs);
    }
}