package ru.stepup.payments;

public class Line {
    private Point start;
    private Point end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public int getLength(){
        int deltaX = end.x - start.x;
        int deltaY = end.y - start.y;
        return (int) Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
    @Override
    public String toString() {
        return "Линия от " + start +
                " до " + end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }


}
