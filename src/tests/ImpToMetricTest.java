package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpToMetricTest {

    @Test
    void showKilometers() {
        assertEquals(0.0, pdf5.ImpToMetric.showKilometers(0));
        assertEquals(0.001, pdf5.ImpToMetric.showKilometers(1));
    }

    @Test
    void showInches() {
        assertEquals(0.0, pdf5.ImpToMetric.showInches(0));
        assertEquals(39.37, pdf5.ImpToMetric.showInches(1));
    }

    @Test
    void showFeet() {
        assertEquals(0.0, pdf5.ImpToMetric.showFeet(0));
        assertEquals(3.281, pdf5.ImpToMetric.showFeet(1));
    }
}