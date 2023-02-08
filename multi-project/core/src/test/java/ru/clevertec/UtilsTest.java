package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    void isAllPositiveNumber_expectedTrue() {
        String str = "56";

        assertTrue(Utils.isAllPositiveNumber(str, str));
    }

    @Test
    void isAllPositiveNumber_expectedFalse_testInt() {
        String str = "-78";

        assertFalse(Utils.isAllPositiveNumber(str, str));
    }

    @Test
    void isAllPositiveNumber_expectedFalse_testString() {
        String str = "hello";

        assertFalse(Utils.isAllPositiveNumber(str, str));
    }

}
