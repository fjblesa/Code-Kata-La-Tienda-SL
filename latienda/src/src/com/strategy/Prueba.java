package src.com.strategy;

import java.math.BigDecimal;
public class Prueba {
	
	public static void main(String[] args) {
		Product p1 = new Product(new SimplePricing(new BigDecimal("2")));
		System.out.println(p1.calculate(new BigDecimal("3")));

		Product p2 = new Product(new WeightPricing(new BigDecimal("1.35")));
		System.out.println(p2.calculate(new BigDecimal("3")));

		Product p3 = new Product(new OfferPricing(new SimplePricing(new BigDecimal("1")), new BigDecimal("3"), new BigDecimal("50")));
		System.out.println(p3.calculate(new BigDecimal("6")));
	}
}

