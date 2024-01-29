package entities;

public class Exer4 {
	public static final double IOF = 0.06;

	public static double currency(double priceDollar, double totalDollar) {
		return priceDollar * totalDollar;
	}
	
	public static double totalCurrency(double priceDollar, double totalDollar) {
		return currency(priceDollar, totalDollar) + (currency(priceDollar, totalDollar) * IOF);
	}
}
