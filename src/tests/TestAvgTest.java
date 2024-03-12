package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAvgTest {

    @Test
    void calculateAverage() {
        assertEquals(3.0, pdf5.TestAvg.calculateAverage(new double[]{1, 2, 3, 4, 5}));
    }

    @Test
    void getGrade() {
        assertEquals(5, pdf5.TestAvg.getGrade(90));
        assertEquals(4, pdf5.TestAvg.getGrade(80));
        assertEquals(3, pdf5.TestAvg.getGrade(70));
        assertEquals(2, pdf5.TestAvg.getGrade(60));
        assertEquals(1, pdf5.TestAvg.getGrade(59));
    }
}