package com.itheima.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest2 {
    public static void main(String[] args) throws ParseException {
        String time = "2023年11月11日 0:11:00";

        boolean flag = check(format(time));
        if(flag){
            System.out.println("恭喜你,秒杀成功!");
        }else {
            System.out.println("很遗憾,秒杀失败");
        }
    }

    private static Date format(String time) throws ParseException {
        return new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").parse(time);
    }

    private static boolean check(Date date) throws ParseException {
        String beginDate = "2023年11月11日 0:0:0";
        String endDate = "2023年11月11日 0:10:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date begin = sdf.parse(beginDate);
        Date end = sdf.parse(endDate);
        long beginTime = begin.getTime();
        long endTime = end.getTime();
        long time = date.getTime();
        if (time >= beginTime && time <= endTime) {
            return true;
        } else {
            return false;
        }
    }

}
