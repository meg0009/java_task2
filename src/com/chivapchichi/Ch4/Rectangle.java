package com.chivapchichi.Ch4;

import com.chivapchichi.ch2.Point;

public class Rectangle extends Shape implements Cloneable {
    private double width;
    private double height;

    public Rectangle(Point center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    public Point getTopRight() {
        return getCenter();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft" + getCenter() +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
