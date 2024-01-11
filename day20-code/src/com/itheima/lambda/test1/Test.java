package com.itheima.lambda.test1;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static Girlfriend[] gfs = new Girlfriend[5];

    static {
        gfs[0] = new Girlfriend("小甜甜", 18, 178.5);
        gfs[1] = new Girlfriend("小诗诗", 16, 170.5);
        gfs[2] = new Girlfriend("小琪琪", 13, 168.5);
        gfs[3] = new Girlfriend("小婷婷", 20, 165.5);
        gfs[4] = new Girlfriend("小露露", 15, 188.5);
    }

    public static void main(String[] args) {
        Arrays.sort(gfs, (o1, o2) -> {
            if (o2.getAge() == o1.getAge()) {
                if(o1.getHeight()== o2.getHeight()){
                    //o1在前,o2在后,是顺序排列,compareTo方法也不例外.
                    return o1.getName().compareTo(o2.getName());
                }
                return (int) (o1.getHeight() - o2.getHeight());
            }
            return o1.getAge() - o2.getAge();
        });
        System.out.println(Arrays.toString(gfs));

    }
}
