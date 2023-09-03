package com.teachmeskills.lesson11.part2;


class Triangle implements IFigures{
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }
}
