import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        IO.println("Entre com os dados do aluguel");
        IO.print("Modelo do carro");
        String carModel = sc.nextLine();

        IO.println("Retirada (dd/MM/yyyy): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        IO.println("Retorno (dd/MM/yyyy)");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        IO.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        IO.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        IO.println("Fatura: ");
        IO.println("Pagamento básico: " +carRental.getInvoice().getBasicPayments());
        IO.println("Imposto: " + carRental.getInvoice().getTax());
        IO.println("Pagamento total: " +carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
