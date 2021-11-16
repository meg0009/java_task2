package com.chivapchichi.ch1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex6 {
    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger res = BigInteger.valueOf(n--);
        while (n > 0) {
            res = res.multiply(BigInteger.valueOf(n--));
        }
        return res;
    }
    public static BigInteger factorial(BigInteger n) {
        if (BigInteger.ZERO.equals(n)) {
            return BigInteger.ONE;
        }
        BigInteger res = n;
        n = n.subtract(BigInteger.ONE);
        while (!n.equals(BigInteger.ZERO)) {
            res = res.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return res;
    }
}
