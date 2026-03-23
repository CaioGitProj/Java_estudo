public class Rectangle extends AbstractShape
{
    private Double width;
    private Double height;

    @Override
    public Double area()
    {
        return (width + height) / 2;
    }
}
