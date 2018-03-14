package be.reneald.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Stock {
    private String stockId;
    private String stockName;
    private StockPrice stockPrice;

    Stock(String stockId, String stockName, StockPrice stockPrice) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public void adjustStockPrice(BigDecimal newPrice) {
        this.stockPrice.setPrice(newPrice);
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

    public StockCurrency getStockCurrency() {
        return stockPrice.getCurrency();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(stockId, stock.stockId) &&
                Objects.equals(stockName, stock.stockName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stockId, stockName);
    }
}
