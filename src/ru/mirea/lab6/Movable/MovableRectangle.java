package ru.mirea.lab6.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        topLeft.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public boolean Speed_checking() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.xSpeed;
    }

    @Override
    public void moveUp() {
        if (!Speed_checking()) {
            System.out.println("Speed of topLeft != Speed of bottomRight");
        } else {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (!Speed_checking()) {
            System.out.println("Speed of topLeft != Speed of bottomRight");
        } else {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (!Speed_checking()) {
            System.out.println("Speed of topLeft != Speed of bottomRight");
        } else {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }


    @Override
    public void moveRight() {
        if (!Speed_checking()) {
            System.out.println("Speed of topLeft != Speed of bottomRight");
        } else {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}