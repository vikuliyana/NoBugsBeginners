package org.example.task1.point;

public class Point implements Movable{
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void moveUp() {
        System.out.println("Point moved up - current coordinates:");
        y = this.y + 1;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }

    @Override
    public void moveDown() {
        System.out.println("Point moved down - current coordinates:");
        y = this.y - 1;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }

    @Override
    public void moveLeft() {
        System.out.println("Point moved left - current coordinates:");
        System.out.println("y = " + y);
        x = this.x - 1;
        System.out.println("x = " + x);
    }

    @Override
    public void moveRight() {
        System.out.println("Point moved right - current coordinates:");
        System.out.println("y = " + y);
        x = this.x + 1;
        System.out.println("x = " + x);
    }
}
