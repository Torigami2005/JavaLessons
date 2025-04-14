package org.example;

public class teachingStaff extends Staff{
     String department;

    public teachingStaff(String name, String age, String address, String employeeId, String workDescription, String s) {
        super(name, age, address, employeeId, workDescription);
    }

    public teachingStaff(String employeeId, String workDescription) {
        super(employeeId, workDescription);
    }

    public teachingStaff() {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String introduction() {
        return String.format("Hello, I am %s. I am %s-yrs old. I live in %s", getName(), getAge(), getAddress()) + String.format("I teach under %s.", department);
    }

}
