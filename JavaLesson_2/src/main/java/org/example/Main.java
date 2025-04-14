package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //String pName = name.substring(0,1).toUpperCase().concat(name.substring(1).toLowerCase());

        System.out.printf("Kinsa ka? ");
        String name = scan.nextLine();

        System.out.printf("Asa ka nag puyo? ");
        String loc = scan.nextLine();

        System.out.printf("Pila imong edad? ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.printf("Pila imong timbang? ");
        double weight = scan.nextDouble();
        scan.nextLine();

        System.out.printf("Hello I am %s %d-yrs old. I live in %s. " +
                "I weigh %.2fkg. %n", name, age, loc, weight);






/////////////////////////Some Commonly Used String Methods///////////////////////////
//   String name = "aleJANdRo";
//  String pName = name.toLowerCase();
//     pName = pName.substring(0,1).toUpperCase().concat(name.substring(1).toLowerCase());
//        System.out.println(pName);
//    //name.indexOf
//        // name.charAt
//    //





        /*
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the store name: ");
        String store = scan.nextLine();

        System.out.print("Enter the item 1: ");
        String item1 = scan.nextLine();

        System.out.print("Enter the price of " + item1 + ": ");
        double price1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter the item 2: ");
        String item2 = scan.nextLine();

        System.out.print("Enter the price of " + item2 + ": ");
        double price2 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter the item 3: ");
        String item3 = scan.nextLine();

        System.out.print("Enter the price of " + item3 + ": ");
        double price3 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Tax: ");
        double tax = scan.nextDouble();



        double sum = price1 + price2 + price3;
        double taxed = sum * tax;
        double total = sum + tax;

        System.out.println(store + "\n" +
                item1 + "\t\t" + price1 +
                "\n" + item2 + "\t\t\t" + price2 +
                "\n" + item3 + "\t\t" + price3
                + "\nSum: \t\t" + sum + "\n" +
                "Tax: \t\t" + taxed + "\n" +
                "Total: \t\t" + total);
*/



    }
}