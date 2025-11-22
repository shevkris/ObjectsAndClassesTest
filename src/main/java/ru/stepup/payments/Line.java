package ru.stepup.payments;

public class Line {
    private Point start;
    private Point end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
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
}
