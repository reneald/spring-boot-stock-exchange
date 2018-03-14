package be.reneald.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class StockRepositoryTest {
    @Test
    public void getStockInformation_whenGivenUnknownStockId_shouldThrowException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            StockRepository.getStockInformation("AB");
        }).withMessage("Stock not found!");
    }

    @Test
    public void getStockInformation_happyPath() {
        //Given
        Stock expectedStock = new Stock("AA", "ABN Amro", new StockPrice(BigDecimal.ONE, StockCurrency.EUR));
        //When
        Stock actualStock = StockRepository.getStockInformation("AA");
        //Then
        Assertions.assertThat(actualStock).isEqualTo(expectedStock);
    }

}