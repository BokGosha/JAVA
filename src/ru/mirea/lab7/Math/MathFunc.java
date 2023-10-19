package ru.mirea.lab7.Math;

public class MathFunc implements MathCalculable {
    public MathFunc(double x) {
        this.x = x;
    }

    private double x;

    public void pow() {
        System.out.println(Math.pow(x, 2));
    }

    public void moduleComplex() {
        System.out.println(Math.abs(x));
    }

    public void Perimeter() {
        System.out.println(PI * 2 * x);
    }
}