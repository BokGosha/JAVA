package ru.mirea.lab6.Temperature;

public class TemperatureTester {
    public static void main(String[] args) {
        Convertable temperature = new ChangingTemperature(32);

        temperature.convert();
    }
}