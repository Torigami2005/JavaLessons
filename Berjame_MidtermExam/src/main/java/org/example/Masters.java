package org.example;

public class Masters extends Student{
private String thesis_title;

    public Masters(String name, int age, String address, String stud_id, String program, double units, String thesis_title) {
        super(name, age, address, stud_id, program, units);
        this.thesis_title = thesis_title;
    }

    public String getThesis_title() {
        return thesis_title;
    }

    public void setThesis_title(String thesis_title) {
        this.thesis_title = thesis_title;
    }

    @Override
    public String summary() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Address: " + getAddress() + "\n" +
                "School Name: " + getSchool_name() + "\n" +
                "Thesis Title: " + getThesis_title();
    }
}
