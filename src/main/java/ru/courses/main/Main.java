package ru.courses.main;


import ru.courses.geometry.Point;


public class Main {

    public static void main(String[] args) {

        System.out.println("Вариант 1");
        Point ourPoint = new Point(3.5, 4.2);
        System.out.println("Точка из класса Point:");
        System.out.println("Координаты: x = " + ourPoint.getX() + ", y = " + ourPoint.getY());
        java.awt.Point awtPoint = new java.awt.Point(10, 20);
        System.out.println("Точка из java.awt:");
        System.out.println("Координаты: x = " + awtPoint.x + ", y = " + awtPoint.y);
        System.out.println("----------");
        System.out.println("Вариант 2");
        ru.courses.geometry.Point ourPointFull = new ru.courses.geometry.Point(1.1, 2.2);
        System.out.println("Точка из класса Point:");
        System.out.println(ourPointFull);
        Point awtPointSimple = new Point(30, 40);
        System.out.println("Точка из java.awt:");
        System.out.println(awtPointSimple);
    }
}