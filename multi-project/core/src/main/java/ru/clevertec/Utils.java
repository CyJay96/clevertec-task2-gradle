package ru.clevertec;

import java.util.Arrays;

public class Utils {

    public static boolean isAllPositiveNumber(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }

}
