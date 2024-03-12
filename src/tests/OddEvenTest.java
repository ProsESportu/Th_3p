package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {

    @Test
    void isEven() {
        assertTrue(pdf5.OddEven.isEven(2));
        assertTrue(pdf5.OddEven.isEven(4));
        assertTrue(pdf5.OddEven.isEven(6));
        assertTrue(pdf5.OddEven.isEven(8));
        assertFalse(pdf5.OddEven.isEven(1));
        assertFalse(pdf5.OddEven.isEven(3));
        assertFalse(pdf5.OddEven.isEven(5));
    }
}