package com.tdhqs;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        String convertedString = string.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = convertedString.length() - 1;

        while (left < right) {
            if (convertedString.charAt(left) != convertedString.charAt(right)) {
                return false;
            }

            left += 1;
            right -= 1;
        }

        return true;
    }
}
