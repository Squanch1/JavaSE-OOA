package com.itheima.interface_.interfacedemo2;

public class TableTennisAthlete extends Athlete implements speakEnglish{
    public TableTennisAthlete() {
    }

    public TableTennisAthlete(String name, int age) {
        super(name, age);
    }

    public void learnPlayTableTennis() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语");
    }
}
