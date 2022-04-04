package com.tdhqs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AcronymTest {
    @Test
    @DisplayName("Method getAcronym")
    void getAcronym() {
        assertAll(() -> assertEquals("СПГТИПЛ", Acronym.getAcronym("Санкт-Петерургский Государственный Технический Институт им. Патриса Лумумбы")),
                () -> assertEquals("HTTP", Acronym.getAcronym("HyperText Transfer Protocol")),
                () -> assertEquals("WWW", Acronym.getAcronym("World Wide Web")),
                () -> assertEquals("NASA", Acronym.getAcronym("National Aeronautics and Space Administration"))
        );
    }
}