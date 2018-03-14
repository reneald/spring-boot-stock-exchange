package be.reneald.api;

import be.reneald.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@ResponseBody
@RequestMapping("/stocks")
@Controller
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
