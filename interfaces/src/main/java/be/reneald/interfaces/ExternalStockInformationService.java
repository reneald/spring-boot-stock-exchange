package be.reneald.interfaces;

import org.apache.commons.lang3.RandomUtils;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class ExternalStockInformationService {
    public BigDecimal getPriceInEuroForStock(String stockId) {
        return new BigDecimal(RandomUtils.nextDouble(10, 100));
    }
}
