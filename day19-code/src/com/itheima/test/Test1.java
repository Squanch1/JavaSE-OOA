package com.itheima.test;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        //用正则表达式直接对输入的文本判断,不用去对它修正,只需要判断,不合法就重新输入
        while (true) {
            String s = null;
            while (true) {
                System.out.println("请输入一个0-100间的整数");
                s = sc.nextLine();
                boolean flag = s.matches("\\d+");
                if (!flag) {
                    System.out.println("输入不是纯数字!");
                    //continue后面就不用写else了,直接重新录入了.
                    continue;
                }
                int i = Integer.parseInt(s);
                if (!(i >= 0 && i <= 100)) {
                    System.out.println("输入范围有误!");
                    continue;
                }
                sum += i;
                list.add(i);
                break;
            }
            if (sum > 200) {
                break;
            }
        }
    }
}
