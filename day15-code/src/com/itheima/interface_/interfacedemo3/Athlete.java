package com.itheima.interface_.interfacedemo3;

import javax.swing.plaf.PanelUI;

public abstract class Athlete extends Person {
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();

}
