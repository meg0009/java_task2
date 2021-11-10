package com.chivapchichi.ch1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex13 {
    public static void method() {
        int size = 49;
        ArrayList<Integer> list = new ArrayList<>(size);
        int res[] = new int[6];
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            int j = rnd.nextInt(size - i);
            res[i] = list.get(j);
            list.remove(j);
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
