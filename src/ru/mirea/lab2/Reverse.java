package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner wordReader = new Scanner(sc.nextLine());
        sc.close();

        ArrayList<String> strings = new ArrayList<>();

        while (wordReader.hasNext()) {
            strings.add(wordReader.next());
        }

        for (int i = 0; i < strings.size() / 2; i++) {
            Collections.swap(strings, i, strings.size() - i - 1);
        }

        System.out.println(strings);
    }
}