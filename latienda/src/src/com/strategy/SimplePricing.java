package src.com.strategy;

import java.math.BigDecimal;

public class SimplePricing implements Pricing {
    BigDecimal unitPrice;

    public SimplePricing(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    @Override
    public BigDecimal calculate(BigDecimal quantity) {
        return unitPrice.multiply(quantity);
    }
}
