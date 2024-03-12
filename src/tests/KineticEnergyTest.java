package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KineticEnergyTest {

    @Test
    void calcKineticEnergy() {
        assertEquals(0.5, pdf5.KineticEnergy.calcKineticEnergy(1, 1));

    }
}