package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        String m;

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                m = "Черви";
            } else if (i == 1) {
                m = "Пики";
            } else if (i == 2) {
                m = "Буби";
            } else {
                m = "Крести";
            }

            cards.add("2 " + m);
            cards.add("3 " + m);
            cards.add("4 " + m);
            cards.add("5 " + m);
            cards.add("6 " + m);
            cards.add("7 " + m);
            cards.add("8 " + m);
            cards.add("9 " + m);
            cards.add("10 " + m);
            cards.add("Валет " + m);
            cards.add("Дама " + m);
            cards.add("Король " + m);
            cards.add("Туз " + m);
        }

        Collections.shuffle(cards);

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число игроков: ");

        int n = sc.nextInt();

        if (n >= 11) {
            System.out.println("Некорректное число игроков");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.printf("Карты %1$d-го игрока: ", i + 1);

                for (int j = i * 5; j < (i + 1) * 5; j++) {
                    System.out.print(cards.get(j));

                    if (j < (i + 1) * 5 - 1) {
                        System.out.print(", ");
                    }
                }

                if (i != n - 1) {
                    System.out.println("\n");
                }
            }
        }
    }
}