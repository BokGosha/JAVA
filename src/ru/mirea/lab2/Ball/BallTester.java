package ru.mirea.lab2.Ball;

public class BallTester {
    public static void main(String[] args) {
        Ball ball_1 = new Ball(4.5, 5.5);
        System.out.println(ball_1);

        ball_1.setXY(4.5, -1.2);
        System.out.println(ball_1);

        ball_1.move(0.5, 0.5);
        System.out.println(ball_1);
    }
}