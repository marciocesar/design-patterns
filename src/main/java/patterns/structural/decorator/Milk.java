package patterns.structural.decorator;

import java.math.BigDecimal;

import static java.time.LocalDate.of;

/**
 * Instance of Product
 */
class Milk implements Product {
	
	@Override
	public void printName() {
		System.out.println("Milk");
	}
	
	@Override
	public void printValidate() {
		System.out.println(of(2021, 4, 21));
	}
	
	@Override
	public void printPrice() {
		System.out.println(new BigDecimal("7.5"));
	}
}