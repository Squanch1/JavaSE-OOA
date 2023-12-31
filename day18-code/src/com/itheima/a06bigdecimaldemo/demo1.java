package com.itheima.a06bigdecimaldemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class demo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.01");
        BigDecimal bd2 = new BigDecimal("0.0001");
        BigDecimal add = bd1.add(bd2);
        System.out.println(add);
        System.out.println(System.currentTimeMillis());


        BigDecimal bigDecimal1 = BigDecimal.valueOf(10);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(3.0);
        System.out.println(bigDecimal2.add(bigDecimal1));

        //RoundingMode 是枚举(enum),枚举和类,接口同级别.
        System.out.println(bigDecimal1.divide(bigDecimal2,3, RoundingMode.HALF_UP));
    }
}