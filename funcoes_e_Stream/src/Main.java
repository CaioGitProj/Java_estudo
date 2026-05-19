import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        /*
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 200.00));
        list.add(new Product("Violão", 1278.1));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 2500.0));
        list.add(new Product("HD case", 89.99));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, (p) -> p.getPrice() > 1000);

        System.out.println(sum);
         */

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        //lista em stream
        Stream<Integer> streamInt = list.stream();
        //Descrevendo os valores
        Stream<String> streamStr = Stream.of("Maria", "Alex", "Bob");
        //iterando os valores segundo uma função
        Stream<Long> streamIterate = Stream.iterate(1L, (x) -> (x + 1) * (x + 1));
        //Sequência de fibonacci
        Stream<Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);


        //Consumindo as Streams:
            //Stream em array
        System.out.println(Arrays.toString(streamInt.toArray()));
            //Pegando streams potencialmente infinitas
        System.out.println(Arrays.toString(streamIterate.limit(15).toArray()));
            //Fibonacci
        System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));

    }
}
