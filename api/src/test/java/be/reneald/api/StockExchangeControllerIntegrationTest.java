package be.reneald.api;

import be.reneald.domain.StockCurrency;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})
public class StockExchangeControllerIntegrationTest {

    @Inject
    private StockExchangeController controller;

    @Test
    public void getStock_givenStockId_shouldReturnStock() {
        String stockId = "AA";

        //When
        StockDto actualDto = controller.getStock(stockId);

        //Then
        Assertions.assertThat(actualDto.getStockId()).isEqualTo(stockId);
        Assertions.assertThat(actualDto.getStockName()).isEqualTo("ABN Amro");
        Assertions.assertThat(actualDto.getCurrency()).isEqualTo(StockCurrency.EUR);
    }
}