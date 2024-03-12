package tests;

import org.junit.jupiter.api.Test;
import pdf5.PaintCalc;

import static org.junit.jupiter.api.Assertions.*;

class PaintCalcTest {

    @Test
    void howManyLitresOfPaint() {
        assertEquals(1.5, PaintCalc.howManyLitresOfPaint(10));
    }

    @Test
    void howManyWorkHours() {
        assertEquals(8.0, PaintCalc.howManyWorkHours(10));
    }

    @Test
    void calculatePaintCost() {
        assertEquals(15.0, PaintCalc.calculatePaintCost(10, 1.5));
    }

    @Test
    void calculateWorkCost() {
        assertEquals(180.0, PaintCalc.calculateWorkCost(10));
    }

    @Test
    void calculateTotalCost() {
        assertEquals(95.0, PaintCalc.calculateTotalCost(15, 80));
    }
}