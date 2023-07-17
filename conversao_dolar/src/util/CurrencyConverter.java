package util;

public class CurrencyConverter {

	public double dollarPrice;
	public double qntdDollars;
	
	public static double IOF = 0.06;
	
	public double calculateAmount() {
		double aux = dollarPrice + dollarPrice * IOF;
		return aux * qntdDollars;
	}

}
