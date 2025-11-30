package ru.stepup.payments;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point[] initialPoints = {
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(8, 9),
        };
        PolyLine polyLine = new PolyLine(initialPoints);
        System.out.println("Созданная ломаная: " + polyLine);

        double polyLineLength = polyLine.getLength();
        System.out.println("Длина ломаной: " + polyLineLength);

        Line[] lines = polyLine.getLines();
        System.out.println("Массив линий ломаной: ");
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Линия " + (i + 1) + ": " + lines[i]);
        }

        double linesLength = 0;
        for (Line line : lines) {
            linesLength += line.getLength();
        }
        System.out.println("Длина массива линий: " + linesLength);
        if (linesLength == polyLineLength) {
            System.out.println("Длину ломаной и длина массива линий совпадают");
        } else {
            System.out.println("Длину ломаной и длина массива линий не совпадают");
        }

        Point pointToChange = polyLine.getPoint(1);
        System.out.println("Точка до изменения: " + pointToChange);
        pointToChange.setX(12);
        pointToChange.setY(8);
        System.out.println("Точка после изменения: " + pointToChange);
        System.out.println("Ломаная линия после изменения точки: " + polyLine);
        System.out.println("Массив линий после изменения точки: ");
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Линия " + (i + 1) + ": " + lines[i]);
        }
    }
}