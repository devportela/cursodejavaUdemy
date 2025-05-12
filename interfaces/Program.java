package interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel:");
        System.out.println("MODELO DO CARRO: ");
        String carModel = sc.nextLine();
        System.out.println("retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();


        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("imposto: " + cr.getInvoice().getTax());
        System.out.println("pagamento total:" + cr.getInvoice().getTotalPayment());


        sc.close();

    }
}
