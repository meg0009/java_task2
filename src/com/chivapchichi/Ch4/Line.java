package com.chivapchichi.Ch4;

import com.chivapchichi.ch2.Point;

public class Line extends Shape implements Cloneable {
    private Point end;

    public Line(Point from, Point to) {
        super(from);
        this.end = to;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        end = end.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "Line{" +
                "from=" + getCenter() +
                "to=" + end +
                '}';
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
