package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempConvTest {

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, pdf5.TempConv.fahrenheitToCelsius(32));
    }
}