package be.reneald.service;

import be.reneald.interfaces.ExternalStockInformationService;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StockServiceTest {
    @Test
    public void getPriceInCorrectCurrency_EURtoGBP() {
        ExternalStockInformationService mockService =  mock(ExternalStockInformationService.class);
        when(mockService.getPriceInEuroForStock("RDS")).thenReturn(new BigDecimal(1));
        StockService testService = new StockService(mockService);
        BigDecimal expectedPrice = new BigDecimal(0.89);

        //When
        BigDecimal actualPrice = testService.getStock("RDS").getStockPrice().getPrice();
        //Then
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void getPriceInCorrectCurrency_EURtoUSD() {
        ExternalStockInformationService mockService =  mock(ExternalStockInformationService.class);
        when(mockService.getPriceInEuroForStock("TSL")).thenReturn(new BigDecimal(1));
        StockService testService = new StockService(mockService);
        BigDecimal expectedPrice = new BigDecimal(1.23);

        //When
        BigDecimal actualPrice = testService.getStock("TSL").getStockPrice().getPrice();
        //Then
        assertEquals(expectedPrice, actualPrice);
    }

}