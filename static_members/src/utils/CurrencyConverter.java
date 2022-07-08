package utils;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double amountReais(double dollarPrice, double amountBought) {
		double aux = dollarPrice * amountBought;
		aux = aux + aux * IOF;

		return aux;
	}
}
