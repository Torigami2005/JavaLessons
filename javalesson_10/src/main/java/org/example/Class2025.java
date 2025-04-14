package org.example;

public class Class2025 {
    public static void main(String[] args) {

/*        Person person = new Person("Alejandro");*/
        /* Person person2 = new Person();*/
        Person person3 = new Person("John", "23");
        Person person4 = new Person("John", "23", "Davao");
        System.out.println("Hello " + person4.getName() + " " + person4.getAge() + "-yrs old. I live in " + person4.getAddress());
        }
}
