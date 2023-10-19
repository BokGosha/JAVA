package ru.mirea.lab19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО клиента: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите номер ИНН клиента: ");
        String inn = scanner.nextLine();

        try {
            innIsValid(inn);
            System.out.println("Номер ИНН действителен");
        } catch (BadINNException e) {
            throw new BadINNException("Номер ИНН недействителен. Он должен состоять из 12 арабских цифр");
        }
    }

    private static void innIsValid(String inn) {
        Pattern pattern = Pattern.compile("[0-9]{12}");
        Matcher matcher = pattern.matcher(inn);
        if (!matcher.find()) {
            throw new BadINNException("Номер ИНН недействителен. Он должен состоять из 12 арабских цифр");
        }
    }
}
