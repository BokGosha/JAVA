package ru.mirea.lab4.Seasons;

public class Main {
    public static void main(String[] args) {
        Season season = Season.Summer;

        season.favouriteSeason(season);

        for (Season season_year : Season.values()) {
            System.out.println(season_year);
            System.out.println(season_year.getDescription());
            System.out.println();
        }
    }
}