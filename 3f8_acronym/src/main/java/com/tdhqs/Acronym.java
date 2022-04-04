package com.tdhqs;

public class Acronym {
    public static String getAcronym(String phrase) {
        StringBuilder acronym = new StringBuilder();

        for (char letter : phrase.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                acronym.append(letter);
            }
        }

        return acronym.toString();
    }
}