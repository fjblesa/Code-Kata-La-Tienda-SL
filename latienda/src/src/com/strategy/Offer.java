package src.com.strategy;

import java.math.BigDecimal;

public interface Offer {
    BigDecimal calculateWithOffer(BigDecimal quantity);

    BigDecimal getNumberWithoutOffer(BigDecimal quantity);
    BigDecimal getNumberWithOffer(BigDecimal quantity);
}
