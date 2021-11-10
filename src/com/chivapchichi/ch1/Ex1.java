package com.chivapchichi.ch1;

import java.util.Scanner;

public class Ex1 {
    public static void method() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        int in = reader.nextInt();
        System.out.println("двоичное: "
                + Integer.toBinaryString(in)
                + "\nвосьмиричное: "
                + Integer.toOctalString(in)
                + "\nшеснадцатиричное: "
                + Integer.toHexString(in)
                + "\nreciprocal: "
                + Double.toHexString(-in));
    }
}
