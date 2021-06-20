package patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
		
		final SalaryCalculator calculator = new SalaryCalculator(new BigDecimal("8500.00"));
		
		calculator.setTax(new FGTS());
		calculator.process();
		
		calculator.setTax(new INSS());
		calculator.process();
		
		calculator.setTax(new IRRF());
		calculator.process();
		
	}
}
