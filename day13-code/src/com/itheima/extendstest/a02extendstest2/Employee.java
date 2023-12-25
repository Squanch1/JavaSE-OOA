package com.itheima.extendstest.a02extendstest2;

public class Employee {
    private String code;

    private String name;

    public Employee() {
    }

    public Employee(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void work(){
        System.out.println(this.name+"在工作");
    }
}
