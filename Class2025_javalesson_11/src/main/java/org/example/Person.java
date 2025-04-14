package org.example;

public abstract class Person {
 private String name;
 private  String age;
 private String address;
 static int personNo;

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
        personNo++;
    }

    public String getAge() {
        personNo++;
        return age;
    }

    public void setAge(String age) {
        personNo++;
        this.age = age;
    }

    public String getName() {
        personNo++;
        return name;
    }

    public void setName(String name) {
        personNo++;
        this.name = name;
    }

    public String getAddress() {
        personNo++;
        return address;
    }

    public void setAddress(String address) {
        personNo++;
        this.address = address;
    }


    public abstract String introduction();
    public abstract void greetings();
}
