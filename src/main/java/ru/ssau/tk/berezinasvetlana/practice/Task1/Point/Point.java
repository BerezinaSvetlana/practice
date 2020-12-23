package ru.ssau.tk.berezinasvetlana.practice.Task1.Point;

public class Point {

    public static void main(String[] args) {
        Point onePoint = new Point(1, 1, 1);
        Point secondPoint = new Point(7, -1, 0);
        Point thirdPoint = new Point(0, -4, -7);

        System.out.println(onePoint);
        System.out.println(secondPoint);
        System.out.println(thirdPoint);
    }

    private double x = 0;
    private double y = 0;
    private double z = 0;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "[" +
                x + ", "
                + y + ", "
                + z +
                ']';
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

