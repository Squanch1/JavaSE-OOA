package com.itheima.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ListUtility {
    private ListUtility() {
    }

//    public static <E> void addAll(ArrayList<E> list, E e1, E e2){
//        list.add(e1);
//        list.add(e2);
//    }

    //E...e 代表一个长度可变的数组
    public static <E> void addAll(ArrayList<E> list, E...e){
        for (E e1 : e) {
            list.add(e1);
        }

    }

}
