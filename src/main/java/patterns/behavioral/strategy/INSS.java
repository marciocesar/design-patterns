package patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * Concrete Strategy
 */
public class INSS implements Tax {
	
	@Override
	public BigDecimal calculate(final BigDecimal amount) {
		final BigDecimal result = amount.multiply(new BigDecimal("0.08"));
		
		System.out.println("Applying INSS tax...");
		System.out.println("Value: " + result);
		
		return result;
	}
}
