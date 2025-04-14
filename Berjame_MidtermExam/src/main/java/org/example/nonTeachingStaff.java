package org.example;

public class nonTeachingStaff extends Staff{
    private String higher_up;


    public nonTeachingStaff(String name, int age, String address, String emp_id, String work_description, double salary, boolean active, String higher_up) {
        super(name, age, address, emp_id, work_description, salary, active);
        this.higher_up = higher_up;
    }

    public String getHigher_up() {
        return higher_up;
    }

    public void setHigher_up(String higher_up) {
        this.higher_up = higher_up;
    }

    @Override
    public String summary() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Address: " + getAddress() + "\n" +
                "What Role: " + getHigher_up() + "\n";
        }

}
