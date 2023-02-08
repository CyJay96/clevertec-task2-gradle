package ru.clevertec;

public class Utils {

    public static boolean isAllPositiveNumber(String... str) {
        for (String num : str) {
            if (!StringUtils.isPositiveNumber(num)) {
                return false;
            }
        }
        return true;
    }

}
