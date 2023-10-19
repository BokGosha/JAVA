package ru.mirea.lab4_1.Shape;

public class Shape {
    private String type;

    public double getArea() {
        return 0.;
    };

    public double getPerimeter() {
        return 0.;
    };

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Shape{" +
                "type='" + type + '\'';
    }
}