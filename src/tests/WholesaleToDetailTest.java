package tests;

import org.junit.jupiter.api.Test;
import pdf5.WholesaleToDetail;

import static org.junit.jupiter.api.Assertions.*;

class WholesaleToDetailTest {

    @Test
    void calculateRetailPrice() {
        assertEquals(10.00,
                WholesaleToDetail.calculateRetailPrice(5.00, 100));
        assertEquals(7.5,
                WholesaleToDetail.calculateRetailPrice(5.00, 50));
    }
}