public class Circle implements Shape
{
    private Double radius;

    @Override
    public Double area()
    {
        return Math.PI * (radius * radius);
    }
}
