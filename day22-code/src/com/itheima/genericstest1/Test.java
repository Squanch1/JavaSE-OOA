package com.itheima.genericstest1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {


    }
    public static void keepPet(ArrayList<? extends Animal> list){
        ListIterator<? extends Animal> iterator = list.listIterator();
        while(iterator.hasNext()){
            Animal a = iterator.next();
            a.eat();
        }

    }
//    public static void keepPet(ArrayList<? extends Cat> list){
//
//    }
//    public static void keepPet(ArrayList<? extends Dog> list){
//
//    }
}
