package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {



        int [][] arr = {
                {9, 8, 7, 1},
                {2, 1, 5, 2},
                {5, 6, 3, 4}
        };
        int least = arr [0][0];

        for (int i = 0; i< arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j ++) {
                least = least > arr[i][j] ? arr [i] [j] : least;
            }
            System.out.println("");
        }
        System.out.println("Least: " + least);

       /* Scanner scan = new Scanner(System.in);
        int arr1[][] = new int[4][3];

        for(int i = 0; i < arr1[i].length; i++){
            for(int j = 0; j < arr1.length; j++){
                System.out.println("Please input on index [" + i + "][" + j + "]: ");
                arr1[j][i] = scan.nextInt();
            }
        }
        for(int i = 0; i < arr1[i].length; i++){
            for(int j = 0; j < arr1.length; j++){
                System.out.print(arr1[j][i]+" ");
            }
            System.out.println("");
        }*/

   /*     int [] [] arr = new int[3][]; // [rows] [columns]
        arr[0] = new int [5];
        arr[1] = new int [3];
        arr[2] = new int [4];
*/
/*        arr [0] [0] = 10;
        arr [1] [2] = 15;
        arr [2] [2] = 20;*/
/*
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }*/
    }



}