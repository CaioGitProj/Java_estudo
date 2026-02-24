import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        entrada.nextLine();

        for(int linha = 0; linha < N; linha++)
        {
            String textoLinha = entrada.nextLine();
            StringBuilder texto = new StringBuilder(textoLinha);

            for(int coluna = 0; coluna < texto.length(); coluna++)
            {
                char c = texto.charAt(coluna);
                if (Character.isLetter(c))
                {
                    texto.setCharAt(coluna, (char) (c + 3));
                }
            }

            texto.reverse();

            for(int coluna = texto.length() / 2; coluna < texto.length(); coluna++)
            {
                char c = texto.charAt(coluna);
                texto.setCharAt(coluna, (char)(c - 1));
            }

            System.out.println(texto.toString());
        }

    }
}