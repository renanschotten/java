package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data:");
		System.out.print("Car model: ");
		String model = sc.nextLine();
		System.out.println("Pickup (dd/MM/yyyy HH:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.println("Return (dd/MM/yyyy HH:ss): ");
		Date finish = sdf.parse(sc.nextLine());
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		CarRental carRental = new CarRental(start, finish, new Vehicle(model));
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println();
		System.out.println("INVOICE");
		System.out.printf("Basic payment: %.2f%n", carRental.getInvoice().getBasicPayment());
		System.out.printf("Tax: %.2f%n", carRental.getInvoice().getTax());
		System.out.printf("Total payment: %.2f%n", carRental.getInvoice().getTotalPayment());
		
		sc.close();
	}

}
