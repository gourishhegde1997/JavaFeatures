package test;

import static org.junit.Assert.assertArrayEquals;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;

public class BuyCar {

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		// your code
		int monthCounter = 0;
		double oldCarPrice = startPriceOld;
		double newCarPrice = startPriceNew;
		double percentLoss = percentLossByMonth;
		final double savingsPerMonth = savingperMonth;
		double totalSavings = oldCarPrice;

		while (totalSavings < newCarPrice) {
			monthCounter = monthCounter + 1;
			totalSavings += savingsPerMonth;
			if (monthCounter != 0 && monthCounter % 2 == 0) {
				percentLoss += 0.5;
			}
			totalSavings = totalSavings - oldCarPrice;
			oldCarPrice = calculateCarPrice(oldCarPrice, percentLoss);
			newCarPrice = calculateCarPrice(newCarPrice, percentLoss);
			totalSavings = totalSavings + oldCarPrice;
		}

		return new int[] { monthCounter, (int) (Math.round(totalSavings - newCarPrice)) };
	}

	public static double calculateCarPrice(double carPrice, double percentLoss) {
		return carPrice - (carPrice * percentLoss / 100);
	}
	
	public static void main(String[] args) {
		int[] output = BuyCar.nbMonths(2000, 8000, 2000, 1.5);
		for(int i : output) {
			System.out.printf("%-5d", i);
		}
		
//		BigInteger bigInt = new BigInteger("1");
//		bigInt = BigInteger.
	}
	
	@Test
	public void test1() {
		int[] r = new int[] { 6, 766 };
		assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
	}
}
