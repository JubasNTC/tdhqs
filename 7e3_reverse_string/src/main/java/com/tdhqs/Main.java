package com.tdhqs;

/*
    Напишите функцию, отображающую переданную строку задом наперёд. Напишите тесты.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Введите строку для получения обратной строки: ");

            String string = input.nextLine();
            String reverseString = Reverser.reverseString(string);

            System.out.println("Исходная строка: " + string);
            System.out.println("Обратная строка: " + reverseString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}