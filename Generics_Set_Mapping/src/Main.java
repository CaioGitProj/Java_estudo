import entities.Product;
import services.CalculationService;
import services.PrintService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        /*
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();


        IO.println("How many values? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        IO.println("First: " + ps.first());

        sc.close();

         */

        List<Product> list = new ArrayList<>();
        String path = "/home/pc/Documentos/Java_Projects/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line = br.readLine();
            while(line != null)
            {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            IO.println("Max:");
            IO.println(x);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
