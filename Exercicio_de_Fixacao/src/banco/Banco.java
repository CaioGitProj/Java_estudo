package banco;

import java.util.Scanner;

public class Banco
{
    private double numConta;
    private String nomeTitular;
    private  double money;

    private static Scanner input = new Scanner(System.in);

    private void verificaNumConta(double numConta)
    {
        if(numConta < 10)
        {

            while(numConta < 0)
            {
                IO.println("""
                        Número de conta inválido.
                        Ele precisa ter dois dígitos e ser maior que 0""");
                numConta = input.nextDouble();
            }
            this.numConta = numConta;
        }

        this.numConta = numConta;
    }

    public Banco(double numConta, String nomeTitular, double money)
    {
        verificaNumConta(numConta);
        this.nomeTitular = nomeTitular;
        this.money = money;
    }
    public Banco(double numConta, String nomeTitular)
    {
        verificaNumConta(numConta);
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular()
    {
        return nomeTitular;
    }
    public void setNomeTitular(String novoNome)
    {
        this.nomeTitular = novoNome;
    }

    public double getNumConta() {
        return numConta;
    }

    public double realizarSaque(double saque)
    {
        if(money < 0)
        {
            IO.println("Saldo insuficiente");
        }
        else
        {
            money += saque - 5;
        }
        IO.println(String.format("Quantidade atual na conta: %.2f", money));
        return money;
    }

    public void depositar(double deposito)
    {
        if(deposito <= 0)
        {
            IO.println("você não pode realizar um depósito nulo ou negativo");
        }
        else
        {
            money += deposito;
            IO.println(String.format("Número atual na conta: %.2f", money));
        }
    }
}
