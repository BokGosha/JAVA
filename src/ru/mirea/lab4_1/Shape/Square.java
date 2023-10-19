package ru.mirea.lab4_1.Shape;

class Square extends Shape {
    private double a;

    public Square(String type, double a) {
        super(type);
        this.a = a;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}