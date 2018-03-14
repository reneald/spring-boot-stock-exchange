package be.reneald.api;

import be.reneald.domain.StockPrice;

import java.math.BigDecimal;
import java.util.Objects;

public class StockDto {
    private String stockId;
    private String stockName;
    private StockPrice stockPrice;

    StockDto(String stockId, String stockName, StockPrice stockPrice) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public String getStockName() {
        return stockName;
    }

    public String getStockId() {
        return stockId;
    }

    public StockPrice getStockPrice() {
        return stockPrice;
    }
}
