package com.tdhqs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    @DisplayName("Method compareTo")
    void compareTo() {
        Person firstPerson = new Person("Belov", "Oleg", 25);
        Person secondPerson = new Person("Agalov", "Victor", 45);
        Person thirdPerson = new Person("Agalov", "Alex", 32);

        assertAll(() -> assertEquals(-1, thirdPerson.compareTo(firstPerson)),
                () -> assertEquals(0, thirdPerson.compareTo(secondPerson)));
    }
}