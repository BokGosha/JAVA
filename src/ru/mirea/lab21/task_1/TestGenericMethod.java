package ru.mirea.lab21.task_1;

import java.util.*;

public class TestGenericMethod {
    public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) {
            lst.add(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        Integer[] array = {12, 34};

        ArrayToArrayList(array, lst);

        for (Integer i : lst) {
            System.out.println(i);
        }

        ArrayList<String> lst_1 = new ArrayList<>();

        String[] array_1 = {"Gosha", "Adam"};

        ArrayToArrayList(array_1, lst_1);

        for (String i : lst_1) {
            System.out.println(i);
        }
    }
}