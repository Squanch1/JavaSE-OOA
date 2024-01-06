package com.itheima.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) throws ParseException {
        String date = "2000-11-11";
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日").format(parse));


    }
}
