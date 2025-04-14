package org.example;

public abstract class Student extends Person{
    private String stud_id;
    private String program;
    private double units;

    public Student(String name, int age, String address, String stud_id, String program, double units) {
        super(name, age, address);
        this.stud_id = stud_id;
        this.program = program;
        this.units = units;
    }


    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public String getStud_id() {
        return stud_id;
    }

    public void setStud_id(String stud_id) {
        this.stud_id = stud_id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public abstract String summary();
}
