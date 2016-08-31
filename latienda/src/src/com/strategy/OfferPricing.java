package src.com.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OfferPricing implements Pricing, Offer{
    Pricing normalPricing;
    BigDecimal offerQuantity;
    BigDecimal offerPercent;
    
    public OfferPricing(Pricing normalPricing, BigDecimal offerQuantity, BigDecimal offerPercent) {
        this.normalPricing = normalPricing;
        this.offerQuantity = offerQuantity;
        this.offerPercent = offerPercent;
    }

    public BigDecimal calculate(BigDecimal quantity) {
        BigDecimal withoutOfferPrice = normalPricing.calculate(getNumberWithoutOffer(quantity));
        BigDecimal withOfferPrice = calculateWithOffer(getNumberWithOffer(quantity));
        
        return withoutOfferPrice.add(withOfferPrice);
    }
    
    public BigDecimal calculateWithOffer(BigDecimal quantity) {
        return normalPricing.calculate(new BigDecimal("1")).multiply(quantity).multiply(getOfferPercent());
    }
    
    public BigDecimal getNumberWithoutOffer(BigDecimal quantity) {
        BigDecimal groups = quantity.divide(offerQuantity, 0, RoundingMode.DOWN);
        return quantity.subtract(groups);
    }
    
    public BigDecimal getNumberWithOffer(BigDecimal quantity) {
        return quantity.subtract(getNumberWithoutOffer(quantity));
    }
    
    private BigDecimal getOfferPercent() {
        return BigDecimal.valueOf(100).subtract(offerPercent).divide(new BigDecimal("100"));
    }
}
