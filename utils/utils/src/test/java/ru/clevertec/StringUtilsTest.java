package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void isPositiveNumber_expectedTrue() {
        String str = "12";

        Assertions.assertTrue(stringUtils.isPositiveNumber(str));
    }

    @Test
    void isPositiveNumber_expectedFalse_testInt() {
        String str = "-34";

        Assertions.assertFalse(stringUtils.isPositiveNumber(str));
    }

    @Test
    void isPositiveNumber_expectedFalse_testString() {
        String str = "hello";

        Assertions.assertFalse(stringUtils.isPositiveNumber(str));
    }

}
