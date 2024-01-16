package com.itheima.treesettest;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> stu = new TreeSet<>((o1, o2) -> {
            double d = o1.getSum() - o2.getSum();
            d = d == 0 ? o1.getChineseScore() - o2.getChineseScore() : d;
            d = d == 0 ? o1.getChineseScore() - o2.getChineseScore() : d;
            d = d == 0 ? o1.getMathScore() - o2.getMathScore() : d;
            int i = (int) d;
            i = i == 0 ? o1.getAge() - o2.getAge() : i;
            i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
            return i;
        });


    }
}
