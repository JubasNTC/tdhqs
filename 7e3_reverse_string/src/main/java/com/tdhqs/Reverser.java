package com.tdhqs;

public class Reverser {
    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
