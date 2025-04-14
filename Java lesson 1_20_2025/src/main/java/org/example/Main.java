package org.example;

import java.util.Scanner;


public class Main {
    /*-----------------------------------------------LESSON 1 1/20/2025----------------------------------------- */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value: ");
        String name = scanner.nextLine();

        System.out.println("Enter number value: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter next value: ");
        String course;
        course = scanner.nextLine();

        System.out.println("Hello! I am " + name + ". " + "I'm " + age + "-yrs old. " + "I'm currently studying " +
                course + " this year.");



        /*
        int num1; // declaration
        num1 = 10; // assignment
        int num2 = 11; // initialization
        int sum = num1 + num2;
        System.out.println("Value: " + sum); // type "sout" then press "TAB" to automatically generate the line.


        float price1;
        price1 = 10.5f;
        float price2 = 11.11f;
        float difference = price2 - price1;
        System.out.println(difference);

        double price_1;
        price_1 = 5.75;
        double price_2 = 1.3;

        double mult = price_1 * price_2;
        System.out.println(mult);
    */
        /* --------------------------------------------STRING LESSON-----------------------------------*/

//        String name1 = "Alejandro";
//        System.out.println("I had a wonderful day. " +
//                "And I would like to tell you about it. " +
//                "But it passed the screen."); //This is only a single line code if it outputs the console.
//        System.out.println("Hello! I am " + name1 + ".");
//    int age = 22;
//    int num1, num2;
//    num1 = 1;
//    num2 = 2;
//    String name = "Alejandro";
//        System.out.println("Hello! I am " + name + " " + age
//        + "-yrs old.");
//        System.out.println(num1 + num2 + " is the value!");
//        int sum = num1 + num2;
//        System.out.println("The value is " + sum);
//
//        String name = "Eman Torr Berjame";
//        int age = 20;
//        String section = "CS-1C";
//        String course = "Computer Science";
//
//        System.out.println("Hello! I am " + name + ". "
//        + "My age is " + age +"-yrs old. " + "My section is " + section + "." +
//        " I'm currently studying " + course + " this year.");


    }
}