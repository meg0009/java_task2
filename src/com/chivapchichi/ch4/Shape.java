package com.chivapchichi.ch4;

import com.chivapchichi.ch2.Point;

public abstract class Shape implements Cloneable {
    private Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void moveBy(double dx, double dy) {
        center = center.translate(dx, dy);
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
