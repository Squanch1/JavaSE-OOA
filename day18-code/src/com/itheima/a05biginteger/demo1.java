package com.itheima.a05biginteger;

import java.math.BigInteger;

public class demo1 {
    public static void main(String[] args) {
        BigInteger bg = new BigInteger("12345698798149846534");
        BigInteger bg2 = BigInteger.valueOf(1236547896456L);
        //System.out.println(bg.add(bg2));
        //注意BigInteger转int和long类型的时候不要超出int和long范围
        System.out.println(bg2.intValue());
        System.out.println(bg2.longValue());
    }
}
