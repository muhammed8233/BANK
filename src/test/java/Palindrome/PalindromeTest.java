package Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
Palindrome palindrome = new Palindrome();
    @Test
    void testToCheckIfUserInputIsAPalindrome() {
        palindrome.palindrome();
        assertNotNull(palindrome.palindrome());
    }
}