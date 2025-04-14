package org.example;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.LinkedTransferQueue;


public class Main {


    public static void display2 (String add, String add1, String sub, String mul, String div){

        int choice;
        switch (choice) {
            case 1 : {
                add = JOptionPane.showInputDialog("Enter value no. 1");
                add1 = JOptionPane.showInputDialog("Enter value no. 2");

            }
        }


    }

    public static void display(String name, String civilStat, String occupation) {
    JOptionPane.showMessageDialog(null, "Name: " + name + "\nCivil Status: " + civilStat + "\nOccupation: " + occupation );
    }

    public static void display1(String add, String add1){
        JOptionPane.showMessageDialog(null, "Sum: " + (add+ add1));
    }

    ////////////////////////////////////////////////////////// MAIN FUNCTION /////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        String name, civilStat, occupation;

        name = JOptionPane.showInputDialog("Enter name");
        civilStat = JOptionPane.showInputDialog("Enter civil status");
        occupation = JOptionPane.showInputDialog("Enter occupation");

        display(name, civilStat, occupation);
    }
////////////////////////////////////////////////////////// MAIN FUNCTION /////////////////////////////////////////////////////////////////////////////////////////////





   /* public static double larger(double x, double y, double z) {
        return x >= y  && x>=z ? x : y >= z ? y : z;
    }

    public static int larger(int x, int y) {
        return x >= y ? x: y;
    }
*/


    /*helloWorld("alejandro", 22);
        System.out.println(larger(3, 5));
      System.out.println(larger(1.0, 2.0, 7));*/



  /*  public static void helloWorld (String name, int age){
        System.out.println("Hello World! I am " + toProperCase(name));
    }*/

   private static String toProperCase(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }


///////////////////////////////////////////////////////////// PREDEFINED CLASSES /////////////////////////////////////////////////////////////////
/*
        System.out.println(!Character.isLetterOrDigit(' '));
*/

/*
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isSpaceChar(' ')); // space characters are true
        System.out.println(Character.isWhitespace('a')); // white space characters are true because it doesn't have any letters having spaces NOR having one
        */
        /*
        System.out.println(Character.isLetterOrDigit('2')); // both true since it's a letter or digit. EXCEPT "*" because it is neither letter or digit
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('2'));
*/

/*
        System.out.println(Math.pow(27,1.0/3.0)); // 3 as the base, 2 is the exponent
        System.out.println(Math.pow(9,0.5)); // 3 as the base, 2 is the exponent
        System.out.println(Math.sqrt(9)); // square root
        */


/*        System.out.println(Math.PI);
        System.out.println(Math.round(1.5));
        System.out.println(Math.ceil(1.2)); // always rounds up
        System.out.println(Math.floor(1.7)); // always rounds down */

        /*System.out.println(Math.min(5, Math.min(7, 10))); // compared three number even though that min accepts two values only
        System.out.println(Math.max(5, Math.min(7, 10))); // compared three number even though that min accepts two values only
*/

/////////////////////////////////////////////////////////// PREDEFINED CLASSES ////////////////////////////////////////////////////////////////


}

