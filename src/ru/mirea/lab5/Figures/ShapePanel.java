package ru.mirea.lab5.Figures;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class ShapePanel extends JPanel {
    private final int NUM_SHAPES = 20;
    private Shape[] shapes;

    public ShapePanel() {
        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();
        for (int i = 0; i < NUM_SHAPES; i++) {
            int type = random.nextInt(2);

            if (type == 0) {
                shapes[i] = new Circle();
            }
            else {
                shapes[i] = new Rectangle();
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.draw(g2);
        }
    }
}