package ru.mirea.lab4_1.Shape_8;

class Square extends Rectangle {
    public void setSide(double side) {
        width = side;
        length = side;
    }

    public double getSide() {
        return width;
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    public Square() {
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public void setLength(double side) {
        length = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}