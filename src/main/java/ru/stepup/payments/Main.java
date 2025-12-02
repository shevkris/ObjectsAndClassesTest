package ru.stepup.payments;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Line line = new Line(1, 3, 5, 8);
        Point[] polyLinePoints = {
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(8, 9)
        };
        PolyLine polyLine = new PolyLine(polyLinePoints);
        Point[] closedPoints = {
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 3),
                new Point(0, 3)
        };
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(closedPoints);

        Measurable[] shapes = {line, polyLine, closedPolyLine};


        for (Measurable shape : shapes) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.println(shape);
            System.out.println(shape.getLength());
            System.out.println();
        }
    }
}