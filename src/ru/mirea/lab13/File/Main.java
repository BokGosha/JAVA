package ru.mirea.lab13.File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String filename = sc.nextLine();

        BufferedReader abc = new BufferedReader(new FileReader(filename));

        List<String> wordList = new ArrayList<String>();

        String line = abc.readLine();

        String[] words = line.split(" ");
        for (String word : words) {
            wordList.add(word);
        }

        System.out.println(getLine(wordList));
    }

    public static String getLine(List<String> array) {
        StringBuilder newString = new StringBuilder(array.get(0));

        for (int i = 0; i < array.size(); i++) {
            char lastChar = Character.toLowerCase(newString.charAt(newString.length() - 1));
            for (int j = 1; j < array.size(); j++) {
                char firstChar = Character.toLowerCase(array.get(j).charAt(0));

                if (firstChar == lastChar) {
                    newString.append(" ").append(array.get(j));

                    break;
                }
            }
        }

        return newString.toString();
    }
}