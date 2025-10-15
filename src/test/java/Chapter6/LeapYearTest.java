package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
 LeapYear year = new LeapYear();

    @Test
    void testToConfirmUserInputIsALeapYear() {
        boolean result = LeapYear.isLeapYears(2020);
        assertTrue(result);
    }
}