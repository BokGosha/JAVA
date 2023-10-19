package ru.mirea.lab5.Figures;

import javax.swing.*;

public class ShapeTester {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.getContentPane().add(new ShapePanel());
    }
}