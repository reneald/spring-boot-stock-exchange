package be.reneald.domain;

public enum StockCurrency {
    EUR ("Euro", "\u20AC", 1),
    USD ("Dollar", "\u0024", 1.23),
    GBP ("Pound", "\u00A3", 0.89);

    private String currencyLabel;
    private String currencySymbol;
    private double conversionRate;

    StockCurrency(String currencyLabel, String currencySymbol, double conversionRate) {
        this.currencyLabel = currencyLabel;
        this.currencySymbol = currencySymbol;
        this.conversionRate = conversionRate;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}
