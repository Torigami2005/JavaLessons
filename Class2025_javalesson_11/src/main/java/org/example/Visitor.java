package org.example;

public class Visitor extends  Person{
    String guestID;

    @Override
    public String introduction() {
        return "";
    }
    public void greetings() {
        System.out.println("Namisita ko");
    }
}
