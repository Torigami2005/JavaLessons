package org.example;

public abstract class Staff extends Person {
    private String emp_id;
    private String work_description;
    private double  salary;
    private boolean active;

    public Staff(String name, int age, String address, String emp_id, String work_description, double salary, boolean active) {
        super(name, age, address);
        this.emp_id = emp_id;
        this.work_description = work_description;
        this.salary = salary;
        this.active = active;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getWork_description() {
        return work_description;
    }

    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public abstract String summary();

}