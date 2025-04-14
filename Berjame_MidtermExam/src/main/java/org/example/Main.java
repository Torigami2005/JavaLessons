package org.example;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        boolean programrun = true;

        while (programrun) {
            String programType = Displays.typeOfPerson() {
                boolean input = true;


                switch (programType) {
                    case "student":
                        Student stud = Displays.createStudent();
                        input = false;
                        break;
                    case "staff":
                        Staff staff = Displays.createStaff();
                        input = false;
                        break;
                    case "guest":
                        Guest guest = Displays.createGuest();
                        input = false;
                        break;
                    case "exit":
                        programrun = false;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice. Please try again!");
                        break;
                }

            }


        }
    }
}