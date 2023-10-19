package ru.mirea.lab21.task_2;

import java.util.ArrayList;

public class KeepArrayTester {
    public static void main(String[] args) {
        String[] lst = {"Gosha", "Adam", "Ivan", "Misha", "Nastya"};

        KeepArray<String> array = new KeepArray<>(lst);

        array.printArray();

        System.out.println("\nЭлемент с индексом 1: " + array.getElement(1));

        Integer[] lst_1 = {1, 2, 3, 4, 5, 6};

        KeepArray<Integer> array_1 = new KeepArray<>(lst_1);

        array_1.printArray();

        System.out.println("\nЭлемент с индексом 3: " + array_1.getElement(3));

        ArrayList<Object> lst_2 = new ArrayList<>();

        createList(lst, lst_2);

        if (lst_2.size() >= 5) {
            for (int i = 0; i < lst_2.size(); i++) {
                System.out.println(lst_2.get(i));

                if (i == 4) {
                    break;
                }
            }
        }
    }

    public static <T> void createList(T[] array, ArrayList<T> lst) {
        for (T i : array) {
            lst.add(i);
        }
    }
}