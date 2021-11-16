package com.chivapchichi;

import com.chivapchichi.ch3.Employee;
import com.chivapchichi.ch3.Measurable;
import com.chivapchichi.ch4.Circle;
import com.chivapchichi.ch4.Line;
import com.chivapchichi.ch4.Rectangle;
import com.chivapchichi.ch4.Shape;
import com.chivapchichi.ch1.*;
import com.chivapchichi.ch2.Car;
import com.chivapchichi.ch2.Point;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Ch1:");
        System.out.println("Ex1:");
        Ex1.method();

        System.out.println("===================================");
        System.out.println("Ex2:");
        System.out.println("using '%':");
        Ex2.method1();
        System.out.println("using floorMod:");
        Ex2.method2();

        System.out.println("===================================");
        System.out.println("Ex3:");
        Ex3.method1();
        Ex3.method2();

        System.out.println("===================================");
        System.out.println("Ex4:");
        Ex4.method();

        System.out.println("===================================");
        System.out.println("Ex6:");
        System.out.println("Факториал 1000 = " + Ex6.factorial(1000));
        System.out.println("Факториал 1000 = " + Ex6.factorial(BigInteger.valueOf(1000)));
        System.out.println("Факториал 0 = " + Ex6.factorial(0));
        System.out.println("Факториал 0 = " + Ex6.factorial(BigInteger.valueOf(0)));

        System.out.println("===================================");
        System.out.println("Ex13:");
        Ex13.method();

        System.out.println("===================================");
        System.out.println("Ch2:");
        System.out.println("Ex5:");
        Point p = new Point(3, 4).translate(1, 3).scale(.5);
        System.out.println(p);
        Point p2 = new Point();
        System.out.println(p2);
        Point p3 = new Point().translate(2, 5).scale(.2);
        System.out.println(p3);

        System.out.println("===================================");
        System.out.println("Ex9:");
        Car car = new Car(10, 100.0001);
        System.out.println(car.run(1000));
        System.out.println(car.getDistance());
        System.out.println(car.getFuel());

        System.out.println("===================================");
        System.out.println("Ch3:");
        System.out.println("Ex1 and Ex2:");
        int size = 10;
        Employee[] e = new Employee[size];
        for (int i = 0; i < size; i++) {
            Random rnd = new Random();
            e[i] = new Employee("e" + i, rnd.nextInt(10000));
        }
        System.out.println(Arrays.toString(e));
        System.out.println(Measurable.average(e));
        System.out.println(Measurable.largest(e));

        System.out.println("===================================");
        System.out.println("Ch4:");
        System.out.println("Ex4:");
        Shape[] sh = new Shape[] {
                new Circle(new Point(2, 4), 5),
                new Rectangle(new Point(7, 3), 4, 10),
                new Line(new Point(1, 3), new Point(8, 6))
        };
        System.out.println(Arrays.toString(sh));
        System.out.println(Arrays.toString(Arrays.stream(sh).peek((a) -> a.moveBy(4, 10)).toArray()));

        System.out.println("===================================");
        System.out.println("Ex5:");
        Shape[] sh2 = new Shape[3];
        for (int i = 0; i < 3; i++) {
            try {
                sh2[i] = sh[i].clone();
            } catch (CloneNotSupportedException exc) {
                System.out.println(exc.toString());
            }
        }
        System.out.println(Arrays.toString(sh2));
        System.out.println(Arrays.toString(Arrays.stream(sh2).peek((a) -> a.moveBy(10, 4)).toArray()));
        System.out.println(Arrays.toString(sh));
    }
}
