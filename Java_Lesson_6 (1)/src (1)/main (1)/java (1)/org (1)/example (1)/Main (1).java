package org.example;

import java.io.*;
import java.util.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        FileWriter output = new FileWriter("output.txt");

        // String to accumulate valid names
        String group1 = "";
        String group2 = "";
        String group3 = "";
        String group4 = "";

        while (scanner.hasNext()) {
            String name = scanner.next();

            int lenName = name.length();

            if ("LMNOPQRSTUVWXYZ".indexOf(name.charAt(0))!= -1) {
                group1 += name + " ";
            }
            else if ("BEGIN".indexOf(name.charAt(0))!= 1) {
                group2 += name + " ";
            }
            else if (lenName % 2 == 0 && lenName % 3 == 0 ){
                group3 += name + " ";
            } else {
                group4 += name + " ";
            }




        }

        String g1 = String.format("Group1: %s", group1);
        String g2 = String.format("\nGroup2: %s", group2);
        String g3 = String.format("\nGroup3: %s", group3);


        output.write(g1);
        output.write(g2);
        output.write(g3);
        output.close();
    }



        /////////////////////////////////////EOF (END-OF-FILE WHILE LOOP////////////////////////////////////
   /*         String x = "";
            while (scanner.hasNext()) {
                String name = scanner.next();
                if (name.equalsIgnoreCase("Alejandro") || name.equalsIgnoreCase("Eve")) continue;
                x += name + " ";
//                x = x + scanner.hasNext();
            }*/
        /////////////////////////////////////EOF (END-OF-FILE WHILE LOOP////////////////////////////////////

        //////////////////////////////////////SENTINEL WHILE LOOP/////////////////////////////////////////////
/*
        String choice = "";
        String choice = JOptionPane.showInputDialog(" 1. New Game\n 2. Continue\n 3. Options\n 4. Quit");
        String choice2 = JOptionPane.showInputDialog(" 1. New Game\n 2. Continue\n 3. Options\n 4. Quit");
        while (!choice.equals("4")) {
            choice = JOptionPane.showInputDialog(" 1. New Game\n 2. Continue\n 3. Options\n 4. Quit");
        }*/
        /*do {
            choice = JOptionPane.showInputDialog(" 1. New Game\n 2. Continue\n 3. Options\n 4. Quit");

            if (choice == "4") {
                choice = JOptionPane.showMessageDialog();
            }
        } while (!choice.equals("4"));
*/

        //////////////////////////////////////SENTINEL WHILE LOOP/////////////////////////////////////////////

        //////////////////////////////////////FLAG-CONTROLLED WHILE LOOP/////////////////////////////////////
/*        boolean state = false;
        do {
        String read = JOptionPane.showInputDialog("Enter name: ");
        state = read.equalsIgnoreCase("alejandro");
        } while (!state);*/
        //////////////////////////////////////FLAG-CONTROLLED WHILE LOOP/////////////////////////////////////



       /* int i = 0;
        while (i <= 5) {
        output.write("A");
        i++;
        }
        for (int x = 0; x <= 5; x++) {
            output.write("B");
        }*/


}