package org.example;

import java.util.Scanner;
import java.io.*;

public class File_text {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner scanner = new Scanner(new FileReader("input.txt"));
        FileWriter output = new FileWriter("output.txt");
        String store = scanner.next();
        String item1 = scanner.next();
        double price1 = scanner.nextDouble();
        String item2 = scanner.next();
        double price2 = scanner.nextDouble();
        String item3 = scanner.next();
        double price3 = scanner.nextDouble();
        double tax = scanner.nextDouble();

        double sum = price1 + price2 + price3;
        double total = tax + sum;


        String formattedOutput = String.format("%s\n" + "%s\t" + "%.2f\n" + "%s\t" + "%.1f\n" + "%s\t" + "%.2f\n" + "TOTAL PRICE: " + "%.2f\n" + "TAX: " + "%.2f\n" + "TOTAL WITH TAX : " + "%.2f",
                store, item1, price1, item2, price2, item3, price3, sum, tax*100, total);
        output.write(formattedOutput);
        output.close();


        /*Scanner scanner = new Scanner(new FileReader("input.txt"));
        FileWriter output = new FileWriter("output.txt");
        String name = scanner.next(); // Alejandro
        String name2 = scanner.next();
        int age = scanner.nextInt(); // 22
        double weight = scanner.nextDouble();

        String formattedString = String.format("Hello I am %s and %s %d-yrs old and I weigh %.2fkg", name, name2, age, weight);
        output.write(formattedString);
        output.close();*/
        }
    }
