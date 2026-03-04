import entities.Account;
import entities.BusinessAccount;

public class Main
{
    public static void main(String[] args)
    {
        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0, 500.0);


        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob", 0.0, 200.0);

        if(acc2 instanceof BusinessAccount)
        {
            IO.println("CU");
        }


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
    }
}
