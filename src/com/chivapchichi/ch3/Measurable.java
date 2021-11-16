package com.chivapchichi.ch3;

public interface Measurable {
    double getMeasure();

    static double average(Measurable[] objects) {
        double res = 0;
        for (Measurable o : objects) {
            res += o.getMeasure();
        }
        return  res / objects.length;
    }

    static Measurable largest(Measurable[] objects) {
        Measurable res = objects[0];
        for (Measurable o : objects) {
            if (o.getMeasure() > res.getMeasure()) {
                res = o;
            }
        }
        return res;
    }
}
