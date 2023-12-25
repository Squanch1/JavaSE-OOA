package com.itheima.extendstest.a01extendstest1;

public class Employee {
    private String workNumber;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String workNumber, String name, double salary) {
        this.workNumber = workNumber;
        this.name = name;
        this.salary = salary;
    }

    public void eat(){
        System.out.println(this.name+"在吃米饭");
    }
    public void work(){
        System.out.println(this.name+"正在工作");
    }
    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
