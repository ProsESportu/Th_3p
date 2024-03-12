package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesTest {

    @Test
    void isPrime() {
        assertTrue(pdf5.Primes.isPrime(2));
        assertTrue(pdf5.Primes.isPrime(3));
        assertTrue(pdf5.Primes.isPrime(5));
        assertTrue(pdf5.Primes.isPrime(7));
        assertFalse(pdf5.Primes.isPrime(1));
        assertFalse(pdf5.Primes.isPrime(4));
        assertFalse(pdf5.Primes.isPrime(6));
    }
}