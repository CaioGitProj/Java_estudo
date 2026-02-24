import banco.Banco;

void main() {
    boolean choice = true;
    Scanner scan = new Scanner(System.in);

    while(choice)
    {
        IO.println("Enter account number:");
        double accountNumber = scan.nextDouble();

        IO.println("Enter acconunt holder:");
        String accountName = scan.next();

        boolean canDeposit = false;

        IO.println("Is there a initial deposit (y/n)?");
        String depositChoice = scan.next();

        if(depositChoice.toLowerCase(Locale.ENGLISH).equals("y") || depositChoice.toLowerCase(Locale.ENGLISH).equals("yes"))
        {
            canDeposit = true;

            IO.println("Enter initial deposit value:");
            double initialDeposit = scan.nextDouble();
            Banco bancoConta = new Banco(accountNumber, accountName, initialDeposit);
        }
        else if(depositChoice.toLowerCase(Locale.ENGLISH).toLowerCase(Locale.ENGLISH).equals("n")|| depositChoice.toLowerCase(Locale.ENGLISH).equals("no"))
        {
            Banco bancoContaNdeposito = new Banco(accountNumber, accountName);

            IO.println(String.format("""
                    Account data:
                    Account %f, Holder: %s, balance""",
                    bancoContaNdeposito.getNumConta(),
                    bancoContaNdeposito.getNomeTitular()));
        }
    }
}