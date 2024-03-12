package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowCharTest {

    @Test
    void showChar() {
        assertEquals('N', pdf5.ShowChar.showChar("cityName", 4));
    }
}