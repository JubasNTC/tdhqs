package com.tdhqs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverserTest {
    @Test
    @DisplayName("Method reverseString")
    void reverseString() {
        assertAll(() -> assertEquals("грубретеП-ткнаС", Reverser.reverseString("Санкт-Петербург")),
                () -> assertEquals("avaJ", Reverser.reverseString("Java")),
                () -> assertEquals("locotorP lortnoC noissimsnarT", Reverser.reverseString("Transmission Control Protocol")),
                () -> assertEquals("TENET", Reverser.reverseString("TENET")),
                () -> assertEquals("", Reverser.reverseString(""))
        );
    }
}