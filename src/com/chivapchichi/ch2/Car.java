package com.chivapchichi.ch2;

public class Car {
    private double kmL = 0;
    private double fuel = 0;
    private double distance = 0;

    public Car(double kmL) {
        this.kmL = kmL;
    }

    public Car(double kmL, double fuel) {
        this.kmL = kmL;
        this.fuel = fuel;
    }

    public boolean run(double distance) {
        if (distance / fuel >= kmL) {
            return false;
        }
        this.distance += distance;
        fuel -= distance / kmL;
        return true;
    }

    public void fuel(double fuel) {
        this.fuel += fuel;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuel() {
        return fuel;
    }
}
