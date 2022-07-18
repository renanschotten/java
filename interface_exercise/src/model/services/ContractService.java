package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private PaymentService paymentService;

	public ContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double value = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			Date dueDate = addMonths(contract.getDate(), i);
			double interest = value + paymentService.interest(value, i);
			double totalValue = interest + paymentService.paymentFee(interest);
			contract.addInstallments(new Installment(dueDate, totalValue));
		}
	}

	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
