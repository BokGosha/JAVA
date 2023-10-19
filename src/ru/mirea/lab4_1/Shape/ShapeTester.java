package ru.mirea.lab4_1.Shape;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Shape ("Square");

        Square square = new Square("Square", 3);
        System.out.println(square.toString());

        Circle circle = new Circle("Circle", 3);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("Rectangle", 3, 5);
        System.out.println(rectangle.toString());
    }
}