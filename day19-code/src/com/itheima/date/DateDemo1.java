package com.itheima.date;

import java.lang.reflect.Member;
import java.util.Date;
import java.util.Random;

public class DateDemo1 {
    public static void main(String[] args) {
//        long time = 365L*24*60*60*1000;
//        Date date = new Date(time);
//        System.out.println(date);

        Random r = new Random();
        Date date1 = new Date(Math.abs(r.nextInt()));
        Date date2 = new Date(Math.abs(r.nextInt()));
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        if (time1 > time2) {

        } else if (time1 < time2) {

        } else {

        }

    }
}
