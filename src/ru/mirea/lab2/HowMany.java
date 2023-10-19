package ru.mirea.lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner wordReader = new Scanner(sc.nextLine());
        sc.close();

        int count = 0;
        while (wordReader.hasNext()) {
            wordReader.next();
            count++;
        }

        System.out.println("Число введённых слов: " + count);
    }
}

