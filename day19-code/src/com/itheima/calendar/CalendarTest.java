package com.itheima.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        String time = "2024年2月1日 0:0:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(time);

        //创建Calendar对象就用静态方法getInstance()方法
        Calendar c = Calendar.getInstance();

        //用setTime方法(和Date中方法重名了),传递Date对象,没返回值.
        c.setTime(date);

        //get方法得到的月份是0-11,分别对应1-12月
        //得到的星期是1-7,对应周日-周六
        //(数字+6)%7才是真正的周几

        c.add(Calendar.DAY_OF_WEEK,30);

        int i = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);



    }
}
