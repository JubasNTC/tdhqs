package com.tdhqs;

import java.util.Scanner;

/*
    Напишите функцию, создающую аббревиатуры.
    Например, на входе строка: "Санкт-Петербургский Государственный Технический Институт им. Патриса Лумумбы".
    На выходе строка: СПБГТИПЛ.
 */

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

            System.out.println("Исходное словосочетание: ");
            System.out.println("Акроним: " + acronym);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}