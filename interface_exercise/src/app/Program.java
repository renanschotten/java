package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalPaymentService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		System.out.println("Enter number of installments: ");
		int n = sc.nextInt();

		Contract contract = new Contract(number, date, value);
		ContractService service = new ContractService(new PayPalPaymentService());
		service.processContract(contract, n);

		System.out.println("Installments");
		for(Installment i : contract.getInstallments()) {
			System.out.println(i.toString());
		}
		sc.close();
	}

}
