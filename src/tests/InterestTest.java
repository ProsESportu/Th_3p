package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestTest {

    @Test
    void presentValue() {
        assertEquals(1000.0, pdf5.Interest.presentValue(1000, 0, 1));
        assertEquals(90.9090909090909, pdf5.Interest.presentValue(1000, 10, 1));

    }
}