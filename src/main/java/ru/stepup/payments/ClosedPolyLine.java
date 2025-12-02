package ru.stepup.payments;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine() {
        super();
    }

    public ClosedPolyLine(Point[] points) {
        super(points);
    }

    @Override
    public String toString() {
        return "Замкнутая " + super.toString();
    }

    @Override
    public double getLength() {
        double baseLength = super.getLength();
        if (getPointCount() < 2) {
            return 0.0;
        }
        Point first = getPoint(0);
        Point last = getPoint(getPointCount() - 1);
        Line closingLine = new Line(last, first);
        return baseLength + closingLine.getLength();
    }

}
