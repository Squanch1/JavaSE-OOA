package com.itheima.treesettest;

public class Student {
    private String name;
    private int age;
    private double chineseScore;
    private double mathScore;
    private double englishScore;


    public Student() {
    }

    public Student(String name, int age, double chineseScore, double mathScore, double englishScore) {
        this.name = name;
        this.age = age;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chineseScore
     */
    public double getChineseScore() {
        return chineseScore;
    }

    /**
     * 设置
     *
     * @param chineseScore
     */
    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }

    /**
     * 获取
     *
     * @return mathScore
     */
    public double getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     *
     * @param mathScore
     */
    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    /**
     * 获取
     *
     * @return englishScore
     */
    public double getEnglishScore() {
        return englishScore;
    }

    /**
     * 设置
     *
     * @param englishScore
     */
    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getSum() {
        return englishScore + chineseScore + mathScore;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chineseScore = " + chineseScore + ", mathScore = " + mathScore + ", englishScore = " + englishScore + "}";
    }

}
