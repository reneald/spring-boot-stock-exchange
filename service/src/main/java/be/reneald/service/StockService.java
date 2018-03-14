package be.reneald.service;

import be.reneald.domain.Stock;
import be.reneald.domain.StockRepository;
import be.reneald.interfaces.ExternalStockInformationService;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class StockService {
    private ExternalStockInformationService externalStockInformationService;

    public StockService(ExternalStockInformationService externalStockInformationService) {
        this.externalStockInformationService = externalStockInformationService;
    }

    public Stock getStock(String stockId) {
        Stock stock;
        try {
            stock = StockRepository.getStockInformation(stockId);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Stock not found!");
        }
        stock.adjustStockPrice(getPriceInCorrectCurrency(stock));
        return stock;
    }

    private BigDecimal getPriceInCorrectCurrency(Stock stock) {
        return externalStockInformationService.getPriceInEuroForStock(stock.getStockId()).multiply(new BigDecimal(stock.getStockCurrency().getConversionRate()));
    }
}