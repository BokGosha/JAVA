package ru.mirea.lab2.Point;

public class Circle {
    private Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Circle() {
        center = new Point(4.7, 3.9);
        r = 1.0;
    }
}