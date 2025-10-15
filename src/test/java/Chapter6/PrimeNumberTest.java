package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    PrimeNumber number = new PrimeNumber();

    @Test
    void testToCheckIfNumberEnterIsPrime() {
     boolean result =    number.isPrime(5);
        assertFalse(result);
    }
}