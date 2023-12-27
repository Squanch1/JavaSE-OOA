package com.itheima.interface_.interfacedemo3;

public class TableTennisAthlete extends Athlete implements English{
    @Override
    public void study() {
        System.out.println("在学打乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("在学英语");
    }
}
