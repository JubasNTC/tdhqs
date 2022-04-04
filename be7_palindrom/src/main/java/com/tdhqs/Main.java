package com.tdhqs;

/*
    Напишите функцию boolean isPalindrome(String input), проверяющую, является ли строка палиндромом. Протестируйте.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Введите строку: ");

            String string = input.nextLine();
            boolean isPalindrome = Palindrome.isPalindrome(string);

            System.out.println("Исходная строка: " + string);
            System.out.println("Является ли строка палиндромом: " + isPalindrome);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}