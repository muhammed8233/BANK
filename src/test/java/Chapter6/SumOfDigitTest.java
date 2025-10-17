package Chapter6;

import SumOfDigit.SumOfDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitTest {
    SumOfDigit sum = new SumOfDigit();

    @Test
    public void testToCheckIfNumberEnterIsSum(){
       int result = SumOfDigit.sumOf(12345);
       assertEquals(15, result);
    }

}