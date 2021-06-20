package patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * Concrete Strategy
 * */
public class FGTS implements Tax {
	
	@Override
	public BigDecimal calculate(final BigDecimal amount) {
		final BigDecimal result = amount.multiply(new BigDecimal("0.05"));
		
		System.out.println("Applying FGTS tax...");
		System.out.println("Value: "+result);
		
		return result;
	}
}