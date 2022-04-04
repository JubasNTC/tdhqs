package com.tdhqs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    @DisplayName("Method reverseString")
    void isPalindrome() {
        assertAll(() -> assertTrue(Palindrome.isPalindrome("aBa")),
                () -> assertTrue(Palindrome.isPalindrome("daad")),
                () -> assertTrue(Palindrome.isPalindrome("teneT")),
                () -> assertTrue(Palindrome.isPalindrome("Искать такси")),
                () -> assertTrue(Palindrome.isPalindrome("Муза ранясь шилом опыта ты помолишься на разум")),
                () -> assertTrue(Palindrome.isPalindrome("")),
                () -> assertFalse(Palindrome.isPalindrome("дженерик")),
                () -> assertFalse(Palindrome.isPalindrome("Java")),
                () -> assertFalse(Palindrome.isPalindrome("palindrome"))
        );
    }
}