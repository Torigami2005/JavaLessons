package org.example;

public abstract class Person {
    private static String name;
    private int age;
    private static String address;
    public static String school_name;


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getSchool_name() {
        return school_name;
    }

    public static void setSchool_name(String school_name) {
        Person.school_name = school_name;
    }

    public static String toTitleCase(){
        return name.substring(0).toUpperCase() +
                name.substring(1).toLowerCase() +
                address.substring(0).toUpperCase() +
                address.substring(1).toLowerCase();
    }

    public abstract String summary();

}
