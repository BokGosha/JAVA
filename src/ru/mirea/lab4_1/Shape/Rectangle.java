package ru.mirea.lab4_1.Shape;

class Rectangle extends Shape {
    private double a;
    private double b;

    @Override
    public String getType() {
        return "Rectangle";
    }

    public Rectangle(String type, double a, double b) {
        super(type);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}