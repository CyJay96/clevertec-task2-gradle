package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void isPositiveNumber_expectedTrue() {
        String str = "12";

        assertTrue(StringUtils.isPositiveNumber(str));
    }

    @Test
    void isPositiveNumber_expectedFalse_testInt() {
        String str = "-34";

        assertFalse(StringUtils.isPositiveNumber(str));
    }

    @Test
    void isPositiveNumber_expectedFalse_testString() {
        String str = "hello";

        assertFalse(StringUtils.isPositiveNumber(str));
    }

}
