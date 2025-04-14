package org.example;

public class Student extends Person {

    private String idNo;
    private String program;

    public Student () {
        super();
    }

    public Student(String name, String age, String address, String idNo, String program) {
        super(name, age, address);
        this.idNo = idNo;
        this.program = program;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String introduction() {
        return String.format("Hello, I am %s. I am %s-yrs old. I live in %s", getName(), getAge(), getAddress())
        + String.format("I have the ID number of %s. I am in %s.", getIdNo(), getProgram());
    }

    @Override
    public void greetings() {
        System.out.println("Student Ako");
    }
}

