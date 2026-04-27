import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("Username1", "Maria Lucena da Silva");
        cookies.put("Username2", "João Alencar de Melo");
        cookies.put("Username3", "Ambrózio Marques de Almeida");
        cookies.put("Username4", "Mario Iaaaaahhh");

        cookies.remove("Username2");

        System.out.println("ALL COOKIES: ");
        for(String keys : cookies.keySet())
        {
            System.out.println(keys + ": " + cookies.get(keys));
        }
    }
}
