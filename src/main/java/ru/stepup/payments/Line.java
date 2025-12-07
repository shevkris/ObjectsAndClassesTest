package ru.stepup.payments;

public class Line implements Measurable{
    private Point start;
    private Point end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line (double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    @Override
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
