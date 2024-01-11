package com.itheima.generics;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtility.addAll(list,"1234","aaaa");
        System.out.println(list);

    }
}
