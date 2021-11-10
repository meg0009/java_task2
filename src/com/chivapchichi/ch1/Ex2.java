package com.chivapchichi.ch1;

import java.util.Scanner;

public class Ex2 {
    public static void method1() {
        System.out.println("введите число");
        Scanner reader = new Scanner(System.in);
        int in = reader.nextInt();
        System.out.println(in >= 0? in % 360 : 360 + in % 360);
    }
    public static void method2() {
        System.out.println("введите число");
        Scanner reader = new Scanner(System.in);
        int in = reader.nextInt();
        System.out.println(Math.floorMod(in, 360));
    }
}
