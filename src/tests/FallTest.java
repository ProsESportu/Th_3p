package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FallTest {

    @Test
    void fallingDistance() {
        assertEquals(4.9, pdf5.Fall.fallingDistance(1));
    }
}