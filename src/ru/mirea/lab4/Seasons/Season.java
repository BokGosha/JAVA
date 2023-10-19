package ru.mirea.lab4.Seasons;

public enum Season {
    Summer("Summer", 25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    Winter("Winter", -10),
    Autumn("Autumn", 10),
    Spring("Spring", 15);

    private int temperature;
    private String title;

    Season(String title, int temperature) {
        this.title = title;
        this.temperature = temperature;
    }

    public String getTitle() {
        return title;
    }

    public int getTemperature() {
        return temperature;
    }

    public void favouriteSeason(Season season) {
        switch (season) {
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
        }
    }

    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return "Season{" +
                "season = '" + title + '\'' +
                ", temperature = " + temperature +
                '}';
    }
}