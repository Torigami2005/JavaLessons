package org.example;

public class Guest extends Person {
    private String date;
    private String purpose;

    public Guest() {
        super(name, age, address);
        this.purpose = purpose;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String summary() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Date issue: " + getDate() + "\n" +
                "Purpose: " + getPurpose();
    }
}
