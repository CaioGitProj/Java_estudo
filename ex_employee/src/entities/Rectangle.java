package entities;

import entities.enums.Color;

public class Rectangle extends Shape
{
    private Double height;
    private Double width;

    public Rectangle(){
        super();
    }
    public Rectangle(double height, double width, Color color)
    {
        super(color);
        this.height = height;
        this.width = width;
    }


    @Override
    public double area()
    {
        return width * height;
    }
}
