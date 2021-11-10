package com.chivapchichi.ch1;

import java.util.Scanner;

public class Ex3 {
    public static void method1() {
        System.out.println("введите три числа");
        Scanner reader = new Scanner(System.in);
        int a1 = reader.nextInt();
        int a2 = reader.nextInt();
        int a3 = reader.nextInt();
        if (a1 > a2 && a1 > a3) {
            System.out.println("largest = " + a1);
        } else if (a2 > a3 && a2 > a1) {
            System.out.println("largest = " + a2);
        } else {
            System.out.println("largest = " + a3);
        }
    }

    public static void method2() {
        System.out.println("введите три числа");
        Scanner reader = new Scanner(System.in);
        int a1 = reader.nextInt();
        int a2 = reader.nextInt();
        int a3 = reader.nextInt();
        System.out.println("largest = " + Math.max(Math.max(a1, a2), a3));
    }
}
