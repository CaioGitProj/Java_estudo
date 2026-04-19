import interfaces.Shape;
import model.Circle;
import model.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(2.0, 3.0));
        myShapes.add(new Circle(2.2));


        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.3));
        myCircles.add(new Circle(7.9));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));








        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(1.1,3.14,6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static double totalArea(List<? extends Shape> list)
    {
        double sum = 0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }

    public static void printList(List<?> list)
    {
        for(Object obj : list)
        {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny)
    {
        destiny.addAll(source);
    }
}