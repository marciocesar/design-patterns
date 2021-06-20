package patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * Context - the class that hold a reference to the strategy
 * and this strategy is defined in run time
 */
public class SalaryCalculator {
	
	private final BigDecimal salary;
	
	private Tax tax;
	
	SalaryCalculator(final BigDecimal salary) {
		this.salary = salary;
	}
	
	void setTax(final Tax tax) {
		this.tax = tax;
	}
	
	BigDecimal process() {
		return tax.calculate(salary);
	}
}
