package ru.mirea.lab5.Figures;

import java.awt.*;
import java.util.Random;

class Circle extends Shape {
    protected int radius;

    public Circle() {
        super();
        Random random = new Random();
        radius = random.nextInt(50) + 20;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillOval(x, y, radius, radius);
    }
}