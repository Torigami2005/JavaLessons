package org.example;

import javax.swing.*;

public class Undergraduate extends Student{
private int yearLevel;
private boolean finishedCapstone;

    public Undergraduate(String name, int age, String address, String stud_id, String program, double units, int yearLevel, boolean finishedCapstone) {
        super(name, age, address, stud_id, program, units);
        this.yearLevel = yearLevel;
        this.finishedCapstone = finishedCapstone;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public boolean isFinishedCapstone() {
        return finishedCapstone;
    }

    public void setFinishedCapstone(boolean finishedCapstone) {
        this.finishedCapstone = finishedCapstone;
    }

    @Override
    public String summary() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Address: " + getAddress() + "\n" +
                "School Name: " + getSchool_name() + "\n" +
                "Year Level: " + getYearLevel() + "\n" +
                "Still Active?: " + isFinishedCapstone() + "\n";
    }




}
