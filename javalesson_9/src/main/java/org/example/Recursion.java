package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Recursion {

    public static String recursion (String word) {
   if (word.contains("1234567890")) {
       return "Not an alphabetical";
   } else if (word.contains("abcdefghijklmnopqrstuvwyxz")) {
       return "letter is an alphabetical";
   }
     return word.indexOf(0)+1);
    }


    public static void main(String[] args) {
        System.out.println(recursion("epal"));


        /*        System.out.println(factorial(5));*/
/*
        System.out.println(toProperCase("tHoMas JoHN alEJandRO mArk"));
*/

    }
}

  /*  public static String toProperCase(String name) {
        if (name.contains(" ")) {
            return toProperCase((name.substring(0, name.indexOf(" ")))) + " " + toProperCase(name.substring(name.indexOf(" ") + 1));
        }
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static int factorial (int x) {
        if ( x<= 1) return 1;
        return x * factorial(x - 1);
    }*/

/*    public static String toProperCase(String name) {

        return name.substring(0,1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase() +
                " " + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase() +
                name.substring(name.indexOf(" ") + 2).toLowerCase();
    }*/

