package ru.mirea.lab2.Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop(int n) {
        computers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите информацию о " + n + " компьютерах: ");

        for (int i = 0; i < n; i++) {
            Computer newComputer = new Computer();

            System.out.print("Процессор " + (i + 1) + "-го компьютера: ");
            newComputer.setProc(sc.nextLine());

            System.out.print("Видеокарта " + (i + 1) + "-го компьютера: ");
            newComputer.setGraphCard(sc.nextLine());

            System.out.print("Объём памяти " + (i + 1) + "-го компьютера: ");
            newComputer.setMemory(sc.nextInt());

            System.out.print("Объём оперативной памяти " + (i + 1) + "-го компьютера: ");
            newComputer.setRam(sc.nextInt());

            sc.nextLine();
            computers.add(newComputer);
        }
    }

    public void addComputer() {
        Computer newComputer = new Computer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Процессор: ");
        newComputer.setProc(sc.nextLine());

        System.out.print("Видеокарта: ");
        newComputer.setGraphCard(sc.nextLine());

        System.out.print("Объём памяти: ");
        newComputer.setMemory(sc.nextInt());

        System.out.print("Объём оперативной памяти: ");
        newComputer.setRam(sc.nextInt());

        computers.add(newComputer);
    }

    public void deleteComputer(int ind) {
        if (ind >= computers.size()) {
            System.out.println("Неверный индекс");

            return;
        }

        computers.remove(ind);
    }

    public Computer findComputer(int ind) {
        return computers.get(ind);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers = " + computers +
                "}";
    }
}