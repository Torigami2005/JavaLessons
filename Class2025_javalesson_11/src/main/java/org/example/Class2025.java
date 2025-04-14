package org.example;

import java.util.*;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Class2025 {

    public static void main(String[] args) {
        Person pers1 = new Staff();
        System.out.println("No. of peeps: " + Person.personNo);

        Person pers2 = new Student();
        System.out.println("No. of peeps: " + Person.personNo);

        Person pers3;
        pers3 = new Student();

        Student stud1 = new Student();
        System.out.println("No. of peeps: " + Person.personNo);

        Staff staff1 = new Staff();
        System.out.println("No. of peeps: " + Person.personNo);

        teachingStaff staff2 = new teachingStaff();
        System.out.println("No. of peeps: " + Person.personNo);

    }


       /* Student pers = new Student();
        String name = JOptionPane.showInputDialog("Enter Name");
        String age = JOptionPane.showInputDialog("Enter Age");
        String address = JOptionPane.showInputDialog("Enter Address");
        String idNo = JOptionPane.showInputDialog("Enter Employee ID");
        String program  = JOptionPane.showInputDialog("Enter Occupation");
        String department = JOptionPane.showInputDialog("Enter Department");
       *//* pers.setName(name);
        pers.setAge(age);
        pers.setAddress(address);
        pers.setIdNo(idNo);
        pers.setProgram(derpartment);
       JOptionPane.showMessageDialog(null, pers.introduction());*//*

       teachingStaff staff = new teachingStaff(name, age, address,idNo , program, department);
       JOptionPane.showMessageDialog(null, staff.introduction());
*/



        /*name = JOptionPane.showInputDialog("Enter Name");
        age =JOptionPane.showInputDialog("Enter Age");
        address =JOptionPane.showInputDialog("Enter Address");
      Student pers2 = new Student(name, age ,address);
      JOptionPane.showMessageDialog(null, pers2.introduction);*/
    }
