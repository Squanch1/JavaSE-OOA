package com.itheima.mycolleciton;

import java.util.Objects;

public class Student {
    private int age;
    private String name;
    private String gender;

    public Student() {
    }

    public Student(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender);
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Student{age = " + age + ", name = " + name + ", gender = " + gender + "}";
    }
}
