package com.tdhqs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Введите словосочетание для получения аббревиатуры: ");

            String phrase = input.nextLine();

            if (phrase.isEmpty()) {
                throw new Exception("Словосочетание не может быть пустой строкой");
            }

            String acronym = Acronym.getAcronym(phrase);

            System.out.println(acronym);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            input.nextLine();
        }
    }
}