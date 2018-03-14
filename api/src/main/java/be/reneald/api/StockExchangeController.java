package be.reneald.api;

import be.reneald.service.StockService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RequestMapping("/stocks") // 'All URLs ending in /stock will be handled by this class'
@RestController // equal to @Controller AND @ResponseBody combined
public class StockExchangeController {
    private StockService stockService;

    @Inject
    public StockExchangeController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{stockId}")
    StockDto getStock(@PathVariable String stockId) {
        return new StockDto(stockService.getStock(stockId).getStockId(), stockService.getStock(stockId).getStockName(), stockService.getStock(stockId).getStockPrice());
    }
}
