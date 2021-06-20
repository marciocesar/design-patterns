package patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * Strategy contract
 * */
public interface Tax {
	
	BigDecimal calculate(final BigDecimal amount);
	
}
