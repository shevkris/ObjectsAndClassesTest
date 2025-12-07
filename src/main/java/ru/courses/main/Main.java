package ru.courses.main;

import ru.courses.math.Maths;

public class Main {
    public static void main(String[] args) {
        String xStr = args[0];
        String yStr = args[1];
        double result = Maths.powerFromStrings(xStr, yStr);
        System.out.printf(xStr, yStr, result);


    }
}