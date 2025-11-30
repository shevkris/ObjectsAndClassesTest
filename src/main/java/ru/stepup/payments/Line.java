package ru.stepup.payments;

public class Line {
    private Point start;
    private Point end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength(){
        double deltaX = end.x - start.x;
        double deltaY = end.y - start.y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
    @Override
    public String toString() {
        return "Линия от " + start +
                " до " + end;
    }
}
