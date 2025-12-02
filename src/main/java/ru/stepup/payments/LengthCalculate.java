package ru.stepup.payments;

public class LengthCalculate {
    public static void processMeasurables(Measurable[] measurables) {
        System.out.println("Обработка " + measurables.length + " объектов:");
        for (Measurable m : measurables) {
            System.out.println("- " + m + " - длина: " + m.getLength());
        }
    }
}
