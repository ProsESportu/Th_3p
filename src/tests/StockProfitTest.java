package tests;

import org.junit.jupiter.api.Test;
import pdf5.StockProfit;

import static org.junit.jupiter.api.Assertions.*;

class StockProfitTest {

    @Test
    void profit() {
        assertEquals(-1210.0, StockProfit.profit(100, 200, 10, 10, 10));
        assertEquals(890.0, StockProfit.profit(200, 100, 10, 10, 10));
    }
}