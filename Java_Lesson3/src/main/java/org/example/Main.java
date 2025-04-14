package org.example;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Main {
    public static void main(String[] args) {





        String store1 = JOptionPane.showInputDialog(null,"Enter Item no. 1: ");
        double price1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Price no. 1: "));

        String store2 = JOptionPane.showInputDialog(null,"Enter Item no. 2: ");
        double price2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Price no. 2: "));

        double taxed = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter tax: "));

        double tax = taxed / 100;
        double tax2 = tax * 100;
        double sum = price1 + price2;

        double total = sum + taxed;
        JOptionPane.showMessageDialog(null, "Item 1: "
                + store1 + "\n"
                + "Price: "
                + price1 +
                "\n"
                + "Item 2: "
                + store2 + "\n" + "Price: " + price2 + "\n"
        + "Total price: " + sum + "\n" + "Tax: " + tax + "\n" + "Percentage of Tax: " + "\n" + tax2 + "%\n"
        + "total price with tax: " + total);


        System.exit(0);





/*
            String num = "11";
            String num2 = "-10.1";
            int x = Integer.parseInt(num);
        double y = Double.parseDouble(num2);
        System.out.println(x);
        String str = JOptionPane.showInputDialog("Put a word");*/
    }
}