package string;

import java.util.Arrays;

public class Program
{
    void main()
    {
        IO.println(String.format("%s" + 5, "olá, mundo "));

        String sUpper = "jkshgfueqagruiofweqnfpin";
        String sLower = "JASDFBHDWIQYUFBVWSAIFBFB";
        IO.println(String.format("|%s| - UPPER\n|%s| - LOWER\n", sUpper.toUpperCase(), sLower.toLowerCase()));


        String fraseStrip = "         AAAH!       ";
        IO.println(String.format("""
                %s - esquerda
                %s - direita
                %s todo
                """, fraseStrip.stripLeading(), fraseStrip.stripTrailing(), fraseStrip.strip()));

        
        String original = "Homem bonito";
        String copiaSubstring = original.substring(6);
        IO.println(copiaSubstring);
        

        String fraseOriginal            = "O rato roeu a roupa do rei de Roma";
        String fraseTrocadaReplace      = fraseOriginal.replace("R", "L");
        String fraseTrocadaReplaceall   = fraseOriginal.replaceAll("r", "L");

        int[] arrayInt = {1,2,3,4,5};

        char[] troca = fraseOriginal.toCharArray();
        for(int i = 0; i < fraseOriginal.length(); i++)
        {
            if(troca[i] == 'r' ^ troca[i] == 'R')
            {
                troca[i] = 'L';
            }
            IO.println(troca);
        }
        
        String conversaoInt = Arrays.toString(arrayInt);
        String trocado = new String(troca);

        String[] separado = trocado.split(" ");
        String reunido = Arrays.toString(separado);


        IO.println(String.format("%s\n%s\n|%s| - Trocado com o for de maneira certa", fraseTrocadaReplace, fraseTrocadaReplaceall, trocado)); //Ele diferencia "r" de "R"
        IO.println(conversaoInt);

        IO.println("CU".repeat(3));

        IO.println("AHHHHHHHHHHHHHHHHHHHHHHH".length());

        IO.println("raio burro doido".lastIndexOf("doido"));

        IO.println(reunido);
    }
}