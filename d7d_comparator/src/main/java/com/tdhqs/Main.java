package com.tdhqs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    Создать класс Person с полями: name, surname, age.
    Имплементировать интерфейс Comparable, используя поля surname и name.
    Добавить несколько объектов Person в List. Использовать Comparator для различных типов сортировки.
    Вывести:
    1) неотсортированный список,
    2) список, отсортированный по name,
    3) список, отсортированный по surname,
    4) список, отсортированный по age"
 */

public class Main {
    public static void main(String[] args) {
        try {
            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Belov", "Oleg", 25));
            persons.add(new Person("Iglov", "Petr", 16));
            persons.add(new Person("Mutov", "Arcadiy", 54));
            persons.add(new Person("Agalov", "Victor", 45));


            System.out.println("Исходный лист:");

            persons.stream().map(person -> "Фамилия: " +
                    person.surname() + "; Имя: " + person.name() + "; Возраст: " +
                    person.age() + ";").forEach(System.out::println);

            System.out.println("\nСортировка по фамилии:");

            Collections.sort(persons);
            persons.stream().map(person -> "Фамилия: " +
                    person.surname() + "; Имя: " + person.name() + "; Возраст: " +
                    person.age() + ";").forEach(System.out::println);

            System.out.println("\nСортировка по имени:");

            persons.stream()
                    .sorted(Comparator.comparing(Person::name))
                    .map(person -> "Фамилия: " + person.surname() + "; Имя: " +
                            person.name() + "; Возраст: " +
                            person.age() + ";").forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}