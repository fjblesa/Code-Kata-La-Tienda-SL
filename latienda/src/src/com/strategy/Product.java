package src.com.strategy;

import java.math.BigDecimal;

public class Product {
    Pricing pricing;
    
    public Product(Pricing pricing) {
        this.pricing = pricing;
    }    
    
    public BigDecimal calculate(BigDecimal quantity) {
        return pricing.calculate(quantity);
    }
}
