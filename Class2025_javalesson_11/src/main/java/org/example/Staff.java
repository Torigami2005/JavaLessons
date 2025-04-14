package org.example;

public class Staff extends Person{
    String employeeId;
    String workDescription;

    public Staff(String name, String age, String address, String employeeId, String workDescription) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.workDescription = workDescription;
    }

    public Staff(String employeeId, String workDescription) {
        this.employeeId = employeeId;
        this.workDescription = workDescription;
    }

    public Staff() {
        super();
    }

    @Override
    public String introduction () {
        return String.format("Hello, I am %s. I am %s-yrs old. I live in %s", getName(), getAge(), getAddress())
                +  String.format("I have the id %s. I work as a %s.", employeeId, workDescription);
    }
    public void greetings() {
        System.out.println("Staff me");
    }
}

