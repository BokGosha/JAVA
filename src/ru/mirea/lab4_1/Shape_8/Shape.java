package ru.mirea.lab4_1.Shape_8;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    abstract double getArea();

    abstract double getPerimeter();

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFilled='" + filled + '\'';
    }
}
