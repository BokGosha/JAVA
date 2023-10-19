package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_7 {
    public static void main(String[] args) {
        String regex = "\\b(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}\\b";

        String s = "LiveIsLife_10";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            System.out.println("Данный пароль является надёжным");
        }
        else {
            System.out.println("Данный пароль не является надёжным");
        }
    }
}
