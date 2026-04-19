package model;

import interfaces.Shape;

public class Rectangle implements Shape
{
    private double height;
    private double width;

    @Override
    public double area()
    {
        return width * height;
    }

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

}