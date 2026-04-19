package model;

import interfaces.Shape;

public class Circle implements Shape
{
    private double radius;

    @Override
    public double area()
    {
        return Math.PI * (radius * radius);
    }

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
}