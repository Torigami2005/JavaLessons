package org.example;

public class teachingStaff  extends Staff{
    private String department;
    private double unitsHandled;

    public teachingStaff(String name, int age, String address, String emp_id, String work_description, double salary, boolean active) {
        super(name, age, address, emp_id, work_description, salary, active);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getUnitsHandled() {
        return unitsHandled;
    }

    public void setUnitsHandled(double unitsHandled) {
        this.unitsHandled = unitsHandled;
    }

    @Override
    public String summary() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Department: " + getDepartment() + "\n" +
                "Units Handled: " +getUnitsHandled();
    }
}
