package src.com.strategy;

import java.math.BigDecimal;

public class WeightPricing implements Pricing{
    BigDecimal weightPrice;

    public WeightPricing(BigDecimal weightPrice) {
        this.weightPrice = weightPrice;
    }
    
    @Override
    public BigDecimal calculate(BigDecimal weight) {
        return weightPrice.multiply(weight);
    }
}
