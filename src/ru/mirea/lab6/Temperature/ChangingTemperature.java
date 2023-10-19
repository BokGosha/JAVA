package ru.mirea.lab6.Temperature;

public class ChangingTemperature implements Convertable {
    public ChangingTemperature(double temperature) {
        this.temperature = temperature;
    }

    private double temperature;

    @Override
    public void convert() {
        System.out.println("Kelvin: " + (temperature + 273));
        System.out.println("Farengeit: " + (temperature * 1.8 + 32));
    }
}