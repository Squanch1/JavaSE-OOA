package com.itheima.staticdemo.a03staticdemo3;

import java.util.ArrayList;

/**
 * 工具类先写私有化构造方法
 * 然后写所有的静态方法
 * 静态方法属于类的层级
 */

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAge(ArrayList<Student> list) {
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student student = list.get(i);
            int age = student.getAge();
            if (maxAge < age) {
                maxAge = age;
            }
        }
        return maxAge;
    }
}
