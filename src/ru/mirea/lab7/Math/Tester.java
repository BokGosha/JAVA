package ru.mirea.lab7.Math;

public class Tester {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(32);
        mc1.pow();
        mc1.moduleComplex();

        MathFunc mc2 = new MathFunc(32);
        mc2.Perimeter();
    }
}
