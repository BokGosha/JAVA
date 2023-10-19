package ru.mirea.lab5.Figures;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected boolean filled;
    protected int x;
    protected int y;

    public Shape() {
        Random random = new Random();

        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        color = new Color(r, g, b);

        x = random.nextInt(400);
        y = random.nextInt(400);
    }

    abstract void draw(Graphics2D g2);
}
