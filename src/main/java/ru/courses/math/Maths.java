package ru.courses.math;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Maths {

    public static double powerFromStrings(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }
}