package patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * Concrete Strategy
 * */
public class IRRF implements Tax{
	
	@Override
	public BigDecimal calculate(final BigDecimal amount) {
		
		final BigDecimal result = amount.multiply(new BigDecimal("0.15"));
		
		System.out.println("Applying IRRF tax...");
		System.out.println("Value: "+result);
		
		return result;
	}
}
