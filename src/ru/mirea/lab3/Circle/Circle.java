package ru.mirea.lab3.Circle;

public class Circle {
    private Point center;
    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "center = " + center +
                ", " + String.format("radius = %1$.2f}", radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        center = new Point();
        radius = 100 * Math.random();
    }
}
