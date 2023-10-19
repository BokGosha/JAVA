package ru.mirea.lab4_1.Shape;

class Circle extends Shape {
    private double r;

    @Override
    public String getType() {
        return "Circle";
    }

    public Circle(String type, double r) {
        super(type);
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}