package ru.mirea.lab2.Circle;

public class CircleTester {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3, -4.5, 1);
        Circle circle2 = new Circle(2.3, -4.5, 1);
        Circle circle3 = new Circle(-5, -4, 2);

        System.out.printf("""
            Периметр первой окружности: %1$f;
            Площадь: %2$f
            """, circle1.perimeter(), circle1.square());

        System.out.print(circle1.compare(circle2) + " " + circle1.compare(circle3));
    }
}