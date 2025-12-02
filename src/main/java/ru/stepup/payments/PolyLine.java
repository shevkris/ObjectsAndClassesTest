package ru.stepup.payments;

import java.util.Arrays;

public class PolyLine implements Measurable{
    Point[] points;

    public PolyLine() {
        this.points = new Point[0];
    }

    public PolyLine(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < this.points.length; i++) {
            sb.append(this.points[i]);
            if (i < this.points.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public Line [] getLines (){
        if (points.length < 2) {
            return new Line[0];
        }
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    public double getLength(){
        if (points.length < 2) {
            return 0;
        }
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            Line line = new Line(points[i], points[i + 1]);
            length += line.getLength();
        }
        return length;
    }

    public Point getPoint(int index){
        if (index >= 0 && index < points.length) {
            return points[index];
        }
        return null;
    }

    public Point[] getPoints(){
        return points;
    }

    public int getPointCount(){
        return points.length;
    }
}

