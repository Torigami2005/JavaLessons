package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileReader("array.txt"));
        Animal[] animals = new Animal[7];

        for (int i = 0; scan.hasNext() && i < animals.length; i++) {
            animals[i] = new Animal();
            animals[i].setSpecies(scan.next());
            animals[i].setKingdom(scan.next());
            animals[i].setAge(Integer.parseInt(scan.next()));
            animals[i].setName(scan.next());
            animals[i].setPrice(Double.parseDouble(scan.next()));
            animals[i].setAvailable(Boolean.parseBoolean(scan.next()));
        }


        for (Animal ani : animals) {
            System.out.println(ani.intro());
        }















/*        String[] names;
        names = new String[2];
        String[] lnames = new String[2];
        names[0] = "Alejandro";
        names[1]= "Samantha";

        for (String n : names) {
            System.out.println(n);
        }
        */


     /*   int[] numbers;
        numbers = new int[5];
        double [] prices = new double[3];

        numbers[0] = 1;
        numbers[1] = 2;*/





/*
        System.out.println(numbers[0] + numbers[1]);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] +=1;
            System.out.println(numbers[i]);
        }
*/

    }
}