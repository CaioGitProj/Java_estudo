package Mat;

import java.security.SecureRandom;

public class Matematica 
{
    public static SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args)
    {
        System.out.println(Math.abs(23.7));// módulo do número

        System.out.println(Math.ceil(3.7));//número arrendondado para cima

        System.out.println(Math.exp(3));//exponencial

        System.out.println(Math.floor(3.7));//número arrendondado para baixo

        System.out.println(Math.log(17));//logarítmo

        System.out.println(Math.max(100.3, 2.4)); //maior número entre dois

        System.out.println(Math.min(100.3, 2.4));// menor número entre dois

        System.out.println(Math.pow(3,2));// número (x) elevado a potência (y)

        System.out.println(Math.sin(2));// Seno do ângulo de número x

        System.out.println(Math.sqrt(25));// Raiz quadrada ne x

        System.out.println(Math.tan(2));// tangente do ângulo de número x

        double doubleValue = 4.5;
        int intValue = (int)doubleValue; //Conversão
        
        System.out.println(intValue);

        System.out.printf("%f Número aleatório gerado %n", randomNumbers.nextFloat(0,1));
    }
}
