package be.reneald.domain;

import com.google.common.collect.ImmutableMap;

import java.math.BigDecimal;
import java.util.Map;

public class StockRepository {
    private static final Map<String, Stock> stockDatabase = new ImmutableMap.Builder<String, Stock>()
            .put("AA", new Stock("AA", "ABN Amro", new StockPrice(BigDecimal.ONE, StockCurrency.EUR)))
            .put("RDS", new Stock("RDS", "Royal Dutch Shell", new StockPrice(BigDecimal.ONE, StockCurrency.GBP)))
            .put("TSL", new Stock("TSL", "Tesla", new StockPrice(BigDecimal.ONE, StockCurrency.USD)))
            .build();

    public static Stock getStockInformation(String stockId) throws IllegalArgumentException {
        if (!stockDatabase.keySet().contains(stockId)) {
            throw new IllegalArgumentException("Stock not found!");
        }
        return stockDatabase.get(stockId);
    }
}
