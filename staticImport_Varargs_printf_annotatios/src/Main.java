
//IMPORT ESTÁTICO!
// import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Main
{
    private static void testePassagemValorReferencia(int valor, Contato contato)
    {
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato-2", "2345-678", "contato2@gmail.com");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato)
    {
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato" + valor);
    }

    public static void main(String[] args)
    {
        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(pow(a,b));
        System.out.println(Math.sqrt(b));

        System.out.println();
        System.out.println();

        Contato contato = new Contato("Contato-1", "5918423576", "contato1@gmail.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        /*
        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        System.out.println();
        System.out.println();
         */

        testePassagemValorReferencia2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);
    }
}
