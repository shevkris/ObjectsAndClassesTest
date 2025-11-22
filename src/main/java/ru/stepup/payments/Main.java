package ru.stepup.payments;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 3,5,8);
        Line line2 = new Line(10,11, 15,19);
        Line line3 = new Line(line1.getEnd(),line2.getStart());
        System.out.println("Линия 3 до изменения: " + line3);

        line3.getStart().setX(20);
        line3.getStart().setY(25);

        line3.getEnd().setX(30);
        line3.getEnd().setY(35);

        System.out.println("Линия 1 после изменения: " + line1);
        System.out.println("Линия 2 после изменения: " + line2);
        System.out.println("Линия 3 после изменения: " + line3);

        int totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Cуммарная длина всех трех линий = " + totalLength);

    }
}