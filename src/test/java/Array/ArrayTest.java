package Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    Array array = new Array();

    @Test
    void testToConfirmThePopulationOfTheTownUsingArray() {
        int [] x = new int[10];
        for(int i = 0; i < x.length; i++){
            x[i] = i;
        }
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, Array.populateArray(x));

    }

    @Test
    void array() {
        int result = Array.array();
        assertEquals(385, result);
    }
}