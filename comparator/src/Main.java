import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 200.00));
        list.add(new Product("Violão", 1278.1));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 2500.0));
        list.add(new Product("HD case", 89.99));

        list.removeIf(Product::staticProductPredicate);


        list.removeIf((p) -> p.getPrice() >= 100.00);
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));


        // list.forEach(new PriceUpdate());
        // list.forEach(Product::staticProductConsumer);
        list.forEach((x) -> x.setPrice(x.getPrice() * 1.1));



        list.forEach((x) -> System.out.printf("%.2f\n", x.getPrice()));
    }
}
