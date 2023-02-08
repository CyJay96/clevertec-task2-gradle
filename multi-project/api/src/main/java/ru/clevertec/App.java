package ru.clevertec;

public class App {

    public static void main(String[] args) {
        boolean isAllPositiveNumber = Utils.isAllPositiveNumber(args);
        System.out.println("Are all numbers positive? " + isAllPositiveNumber);
    }

}
