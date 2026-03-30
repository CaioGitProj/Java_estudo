package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T>
{
    private List<T> list = new ArrayList<>();

    public void addValue(T value)
    {
        list.add(value);
    }

    public T first()
    {
        if(list.isEmpty()){
            throw new IllegalStateException("The list is empty");
        }
        return list.getFirst();
    }

    public void print()
    {
        IO.println("[");
        if(!list.isEmpty()){
            IO.println(list.getFirst());
        }
        for(int i = 1; i < list.size(); i++)
        {
            IO.println("," + list.get(i));
        }
        IO.println("]");
    }
}
