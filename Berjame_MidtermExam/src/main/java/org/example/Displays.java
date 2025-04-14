package org.example;
import javax.swing.*;
import java.util.*;

public class Displays {


    public static String typeOfPerson(){
        return JOptionPane.showInputDialog("Enter Type" +
                "(Student)\n" +
                "(Staff)\n" +
                "(Guest)\n" +
                "(Exit)\n"
        );
    }
        public static Student createStudent() {
        String name = JOptionPane.showInputDialog("Enter name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age: "));
        String address = JOptionPane.showInputDialog("Enter Address: ");
        String stud_id = JOptionPane.showInputDialog("Enter Student ID: ");
        String program = JOptionPane.showInputDialog("Enter Program/Course: ");
        double units = Double.parseDouble(JOptionPane.showInputDialog("Enter Units: "));
            return null;
        }

        public static Staff createStaff() {
        String name = JOptionPane.showInputDialog("Enter Name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age: "));
        String address = JOptionPane.showInputDialog("Enter Address: ");
        String emp_id = JOptionPane.showInputDialog("Enter Employee ID: ");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary: "));
            return null;
        }


        public static Guest createGuest() {

        }

        public static void displayCompleteSummary() {

        }
    }
}

