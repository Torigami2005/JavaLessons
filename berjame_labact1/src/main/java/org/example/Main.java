package org.example;

import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new FileReader("personalInfo.txt"));
        FileWriter output = new FileWriter("output.txt");
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String pName = name.toLowerCase();
        pName = pName.substring(0,1).toUpperCase().concat(name.substring(1).toLowerCase());


        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String phoneNum = JOptionPane.showInputDialog("Enter your phone number: ");

        String occupation = JOptionPane.showInputDialog("Enter your occupation: ");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your salary: "));
        String homeAddress = JOptionPane.showInputDialog("Enter your home address: ");
        String homeAdd = name.toLowerCase();
        homeAdd = homeAddress.substring(0,1).toUpperCase().concat(homeAddress.substring(1).toLowerCase());

        String currentAddress = JOptionPane.showInputDialog("Enter your current address: ");
        String currAdd = name.toLowerCase();
        currAdd = currentAddress.substring(0,1).toUpperCase().concat(currentAddress.substring(1).toLowerCase());

        String emergencyContact = JOptionPane.showInputDialog("Enter emergency name: ");
        String emrgncyName = JOptionPane.showInputDialog("Enter your current address: ");
        String emrgncyName = emergencyContact.toLowerCase();
        emrgncyName = emergencyContact.substring(0,1).toUpperCase().concat(emergencyContact.substring(1).toLowerCase());
        String emergencyNum = JOptionPane.showInputDialog("Enter emergency person's phone number: ");


        double tax = (.25 * salary);
        double total = salary - tax;



        String formatOutput = String.format("Name: \t" + "%s\n" +
                "Age: \t" + "%d\n"
                + "Phone Number: \t" + "%s\n" + "-------------------------------\n" + "Occupation: " + "%s\n" +
                "Salary: \t" + "$ " + "%,.3f\n" + "Tax 25: \t" + "$ "+ "%,.3f\n"  + "After Deduction: " + "$ " + "%,.3f\n"
                + "-------------------------------\n" +
                "Home: \t\t" + "%s\n" + "Current: \t" + "%s\n" + "-------------------------------\n" +
                "Emrgncy Cont: \t" + "%s\n" + "Emrgncy No.: \t" + "%s\n", pName, age, phoneNum, occupation , salary, tax, total, homeAdd ,currAdd , emrgncyName ,emergencyNum);
        output.write(formatOutput);
        output.close();

        JOptionPane.showMessageDialog(null, formatOutput);
    }
}