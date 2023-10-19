package ru.mirea.lab6.Movable;

public class MovableTester {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 1, 4);
        System.out.println(m);
        m.moveUp();
        m.moveRight();
        System.out.println("Up+Right -> " + m);

        m = new MovableCircle(0, 0, 2, 4, 6);
        System.out.println(m);
        m.moveDown();
        m.moveLeft();
        System.out.println("Down+Left -> " + m);

        m = new MovableRectangle(0, 0, 4, 4, 2,4);
        System.out.println(m);
        m.moveRight();
        m.moveDown();
        System.out.println("Right+Down -> " + m);

        MovableRectangle r = (MovableRectangle) m;
        r.setSpeed(3, 6);
        r.moveDown();
    }
}
