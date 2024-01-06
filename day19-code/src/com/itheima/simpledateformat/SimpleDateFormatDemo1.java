package com.itheima.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        //构造方法时传递格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");

        //SDF中的format方法是将Date类型的对象格式化成String的对象
        //format(格式化)
        String format = sdf2.format(new Date());
        System.out.println(format);

        //parse(解析)
        String str = "24年01月02日 12:14:25";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date parse = sdf3.parse(format);
        System.out.println(parse);


    }
}
