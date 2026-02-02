package início;

import java.util.Scanner;

public class print 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Student bob         = new Student("Bob", 10.5);
        Student nathan      = new Student("Nathan", 99.9);

        System.out.printf("%s%n%s%n", "Welcome to", "Java programing!");
        System.out.printf("%s%n", "Seja bem-vinda", " Ana");
        System.out.printf("%s", "seja bem-vinda!\n", "Ana");

        System.out.println("Digite um número");
        int num = input.nextInt();

        System.out.println(num >= 60 ? "Maior que 60" : "Não é maior que 60");
        input.close();



        System.out.printf("%s's letter grade is: %s%n", bob.getName(), bob.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", nathan.getName(), nathan.getLetterGrade());
    }
}
