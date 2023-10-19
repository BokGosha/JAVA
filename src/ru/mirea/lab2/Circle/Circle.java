package ru.mirea.lab2.Circle;

public class Circle {
    private double x_center;
    private double y_center;
    private double radius;

    public double getxCenter() {
        return x_center;
    }

    public void setxCenter(double xCenter) {
        this.x_center = xCenter;
    }

    public double getyCenter() {
        return y_center;
    }

    public void setyCenter(double yCenter) {
        this.y_center = yCenter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double xCenter, double yCenter, double radius) {
        this.x_center = xCenter;
        this.y_center = yCenter;
        this.radius = radius;
    }

    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean compare(Circle circle) {
        return x_center == circle.x_center &&
                y_center == circle.y_center &&
                radius == circle.radius;
    }
}