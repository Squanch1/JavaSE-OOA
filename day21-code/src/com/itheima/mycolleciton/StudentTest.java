package com.itheima.mycolleciton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class StudentTest {
    public static Student[] students = new Student[3];
    public static ArrayList<Student> stu = new ArrayList<>();

    static {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(18 + i, "小马", "female");
            stu.add(students[i]);
        }
    }

    public static void main(String[] args) {
        Iterator<Student> iterator = stu.iterator();
//        while (iterator.hasNext()) {
//            Student next = iterator.next();
//            System.out.println(next);
//        }

//        for (Student student : stu) {
//            System.out.println(student);
//        }//
        stu.forEach(student -> System.out.println(student)
        );
//        for (int i = 0; i < stu.size(); i++) {
//            System.out.println(stu.get(i));
//        }

    }
}
