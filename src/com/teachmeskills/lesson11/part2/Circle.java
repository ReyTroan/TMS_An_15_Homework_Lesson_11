package com.teachmeskills.lesson11.part2;



class Circle implements IFigures{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
