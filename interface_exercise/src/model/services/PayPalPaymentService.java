package model.services;

public class PayPalPaymentService implements PaymentService {
	public static final double MONTHLY_INTEREST = 0.01;
	public static final double PAYMENT_FEE = 0.02;

	@Override
	public double paymentFee(Double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(Double amount, Integer month) {
		return amount * MONTHLY_INTEREST * month;
	}

}
