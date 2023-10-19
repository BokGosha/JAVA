package ru.mirea.lab3.Circle;

import java.util.Random;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = 100 * Math.random();
        Random rand = new Random();
        y = 100 * rand.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("Point{x = %1$.2f, y = %2$.2f}", x, y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}