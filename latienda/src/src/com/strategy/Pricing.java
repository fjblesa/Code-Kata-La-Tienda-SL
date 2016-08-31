package src.com.strategy;

import java.math.BigDecimal;

public interface Pricing {
    BigDecimal calculate(BigDecimal quantity);
}
