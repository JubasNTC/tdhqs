package com.tdhqs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    @DisplayName("Method get")
    void get() {
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(1);

        assertAll(() -> assertEquals(1, arrayList.get(0)),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    arrayList.get(5);
                }));
    }

    @Test
    @DisplayName("Method add")
    void add() {
        CustomArrayList arrayList = new CustomArrayList();

        assertAll(() -> assertTrue(arrayList.add(1)),
                () -> assertTrue(arrayList.add(3)),
                () -> assertTrue(arrayList.add(5)));
    }

    @Test
    @DisplayName("Method delete")
    void delete() {
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);

        assertAll(() -> assertEquals(4, arrayList.delete(3)),
                () -> assertEquals(5, arrayList.get(3)),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    arrayList.delete(100);
                })
        );
    }

    @Test
    @DisplayName("Method deleteAll")
    void deleteAll() {
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(5);

        Predicate<Integer> isEven = i -> (i % 2 == 0);
        arrayList.deleteAll(isEven);

        assertAll(() -> assertEquals(3, arrayList.get(0)),
                () -> assertEquals(1, arrayList.get(1)),
                () -> assertEquals(5, arrayList.get(2)),
                () -> assertEquals(5, arrayList.get(3)),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    arrayList.get(4);
                })
        );
    }
}