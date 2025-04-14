package org.example;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        FileWriter output = new FileWriter("output.txt");
        String name1 = String.valueOf(scanner.next().length());
        String name2 = String.valueOf(scanner.next().length());
        String name3 = String.valueOf(scanner.next().length());
        String name4 = String.valueOf(scanner.next().length());
        String name5 = String.valueOf(scanner.next().length());
        String name6 = String.valueOf(scanner.next().length());
        String name7 = String.valueOf(scanner.next().length());
        String name8 = String.valueOf(scanner.next().length());
        String name9 = String.valueOf(scanner.next().length());
        String name10 = String.valueOf(scanner.next().length());
        String name11 = String.valueOf(scanner.next().length());
        String name12 = String.valueOf(scanner.next().length());
        String name13 = String.valueOf(scanner.next().length());
        String name14 = String.valueOf(scanner.next().length());
        String name15 = String.valueOf(scanner.next().length());
        String name16 = String.valueOf(scanner.next().length());
        String name17 = String.valueOf(scanner.next().length());
        String name18 = String.valueOf(scanner.next().length());
        String name19 = String.valueOf(scanner.next().length());
        String name20 = String.valueOf(scanner.next().length());

        int sum = Integer.parseInt(name1 + name2 +
                name3 + name4 + name5 +
                name6 + name7 + name8 + name9 +
                name10 + name11 + name12 + name13 +
                name14 + name15 + name16 + name17 + name18 +
                name19 +name20);

        if (sum % 10 == 0) {
            System.out.println("All strings are divisible by 10");
        } else if ( sum % 7 == 0) {
            System.out.println("All strings are divisible by 7");
        } else if (sum % 6 ==0) {
            System.out.println("All strings are divisible by 6");
        } else {
            System.out.println("ambot nalang yati");
        }

        output.write("");
        output.close();








/*        String name = scanner.next(); // Lemuel
        String name1 = scanner.next(); // Fritz
        String name2 = scanner.next(); // Pat
        String name3 = scanner.next(); // Angela
        String name4 = scanner.next(); // Angel
        String name5 = scanner.next(); // Eman

        String value = name.compareTo(name1) >= 0 ? name : name1;
        String value1 = name2.compareTo(name3) >= 0 ? name2 : name3;
        String value2 = name4.compareTo(name5) >= 0 ? name4 : name5;

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();

        int avg1 = (num1 + num2) / 2;
        int avg2 = (num3 + num4) / 2;
        int avg3 = (num5 + num6) / 2;



        String formatOutput = String.format("Name: " + "%s" + "\tAverage: " + "%d\n" +
                                            "Name: " + "%s" + "\tAverage: " + "%d\n"+
                                            "Name: " + "%s" + "\tAverage: " + "%d\n",
                                            value, avg1, value1, avg2 , value2, avg3);*/






      /*  String value = num > 50 ? "big" : num > 25 ? "adequate" : "small";

        System.out.println("The num is " + value);*/


        /////////////////////////////////////////////////// IF ELSE STATEMENTS ////////////////////////////////////////////////////
   /*     if (num > 50) {
            System.out.println("big");
        } else if (num > 25) {
            System.out.println("adequate");
        } else {
            System.out.println("small");
        }

        if (name.toUpperCase().compareTo(name1.toLowerCase()) > 0) {
            System.out.println(name);
        } else if (name.compareTo(name1) < 0) {
            System.out.println("equal");
        }*/


    }
}