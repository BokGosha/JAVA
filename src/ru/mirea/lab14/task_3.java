package ru.mirea.lab14;

import java.util.regex.*;

public class task_3 {
    public static void main(String[] args) {
        String regexUSD = "\\b(\\d+\\.\\d{1,2}?) USD\\b";
        String regexRUB = "\\b\\d+ RUB\\b";
        String regexEU = "\\b(\\d+\\.\\d{1,2}?) EU\\b";

        String s = "Список цен: 2.58 USD, 2.544 USD, 1000 RUB, 1.56 EU.";

        Pattern patternUSD = Pattern.compile(regexUSD);
        Pattern patternRUB = Pattern.compile(regexRUB);
        Pattern patternEU = Pattern.compile(regexEU);

        Matcher priceUSD = patternUSD.matcher(s);
        Matcher priceRUB = patternRUB.matcher(s);
        Matcher priceEU = patternEU.matcher(s);

        while (priceUSD.find()) {
            System.out.println(priceUSD.group());
        }

        while (priceRUB.find()) {
            System.out.println(priceRUB.group());
        }

        while (priceEU.find()) {
            System.out.println(priceEU.group());
        }
    }
}