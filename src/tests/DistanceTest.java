package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void calcDistance() {
        assertEquals(0, pdf5.Distance.calcDistance(0, 0));
        assertEquals(1, pdf5.Distance.calcDistance(1, 1));
        assertEquals(3, pdf5.Distance.calcDistance(1, 3));
    }
}