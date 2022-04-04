package com.tdhqs;

public class Person implements Comparable<Person>{
    private String surname;
    private String name;
    private int age;

    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String surname() {
        return this.surname;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }

    @Override
    public int compareTo(Person person) {
        return this.surname.compareTo(person.surname);
    }
}
