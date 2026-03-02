import entities.HourContract;
import entities.enums.WorkerLevel;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import entities.Department;
import java.util.Scanner;
import java.util.Locale;
import entities.Worker;
import java.util.Date;

public class Main
{
    public static void main(String[] args) throws ParseException
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        IO.print("Enter department's name");
        String departmentName = sc.nextLine();

        IO.print("Enter Worker's data:");
        IO.print("Name: ");
        String workerName = sc.nextLine();
        IO.print("Level: ");
        String workerLevel = sc.nextLine();
        IO.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(new Department(departmentName), baseSalary, WorkerLevel.valueOf(workerLevel),workerName);

        IO.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            IO.println("Enter contract #" + i + " data:");
            IO.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            IO.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            IO.print("Duration(hours)");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        sc.close();
    }
}
