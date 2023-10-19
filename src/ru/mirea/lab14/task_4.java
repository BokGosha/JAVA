package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_4 {
    public static void main(String[] args) {
        String regex = "\\b\\d+\\b(?! \\+)";

        String s = "1 - 8 - 5 + 9";

        Pattern pattern = Pattern.compile(regex);

        Matcher plus = pattern.matcher(s);

        boolean found = false;

        while (plus.find()) {
            found = true;
            System.out.println("Найдено число без знака '+': " + plus.group());
        }

        if (!found) {
            System.out.println("В тексте нет чисел без знака '+'");
        }
    }
}