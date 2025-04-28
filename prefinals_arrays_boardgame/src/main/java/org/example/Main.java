package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.*;

public class Main {

    static Random rand = new Random();

    public static final String[] encounters = {"🤮", "👦", "🎶", "😎", "🚽", "🔐", "😎", "🍸", "🎶", "😎", "🚽", "🍸", "😎", "🔐", "🍸", "👧", "🎶", "🤮"};

    public static int diceRoll(int sides) {
        return rand.nextInt(1, sides + 1);
    }

    static int position = 0;
    static boolean secondWind = false;

    static int enjoymentLevelA = 5; // out of 10 maximum
    static boolean foundSamantha = false;

    static int enjoymentLevelS = 8;
    static boolean foundAlejandro = false;

    public static void main(String[] args) throws IOException {
        FileWriter output = new FileWriter("club_night.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a character: \n1) Alejandro \n2) Samantha");
        int characterPick = scanner.nextInt();

        if (characterPick == 1) { // Alejandro route
            for (int hour = 20; hour <= 27; hour++) {  // Loop from 8 PM (20) to 3 AM (27)
                // Adjust time format to PM/AM, converting hours from 8 PM to 3 AM
                String time;
                if (hour >= 20 && hour < 24) {
                    time = (hour - 12) + "pm";  // PM hours from 8 to 11 PM
                } else if (hour == 24) {
                    time = "12am";  // Midnight (12 AM)
                } else {
                    time = (hour - 24) + "am";  // AM hours from 1 AM to 3 AM
                }

                output.write(String.format("@ %s\n", time));
                output.write("Alejandro's Enjoyment Bar: " + "⚡".repeat(enjoymentLevelA) + "\n");

                // Print playing board
                printBoard(output);

                int roll = diceRoll(6);
                if (secondWind) {
                    roll += 2;
                    secondWind = false;
                }

                position = (position + roll) % encounters.length;

                String event = encounters[position];
                enjoymentLevelA = Math.min(enjoymentLevelA, 10);

                switch (event) {
                    case "🎶":
                        output.write("Alejandro enjoyed some music 🎶\n");
                        enjoymentLevelA = Math.min(enjoymentLevelA + 1, 6);
                        break;
                    case "😎":
                        output.write("Alejandro got intimidated talking to 😎\n");
                        enjoymentLevelA = Math.max(enjoymentLevelA - 2, 0);
                        break;
                    case "🚽":
                        output.write("Alejandro got a second wind after a toilet break. + 2 next turn\n");
                        secondWind = true;
                        break;
                    case "👧":
                        output.write("Alejandro met up with Samantha.\n");
                        foundSamantha = true;
                        break;
                    case "🤮":
                        output.write("Alejandro is feeling sick... 🤮\n");
                        enjoymentLevelA = Math.max(enjoymentLevelA - 2, 0);
                        break;
                    case "🍸":
                        output.write("Alejandro enjoyed a cocktail 🍸\n");
                        enjoymentLevelA = Math.min(enjoymentLevelA + 1, 4);
                        break;
                    case "🔐":
                        output.write("Alejandro is back to the start! 🔐\n");
                        enjoymentLevelA = Math.min(enjoymentLevelA + 1, 4);
                        break;
                    case "👦":
                        output.write("Alejandro made a new friend 👦\n");
                        enjoymentLevelA = Math.min(enjoymentLevelA + 1, 4);
                        break;
                    default:
                        break;
                }

                output.write(String.format("Alejandro rolled %d.\n\n", roll));

                if (foundSamantha) {
                    break;
                }
            }

            if (foundSamantha) {
                if (enjoymentLevelA >= 5) {
                    output.write("Alejandro ended the night ecstatic as he left with Samantha.\n");
                } else if (enjoymentLevelA >= 3) {
                    output.write("Alejandro ended the night with mediocre enjoyment as he left with Samantha.\n");
                } else {
                    output.write("Alejandro ended the night exhausted as he left with Samantha.\n");
                }
            } else {
                output.write("Alejandro never found Samantha and left the club alone.\n");
            }

            output.close();
        } else if (characterPick == 2) { // Samantha route
            for (int hour = 20; hour <= 27; hour++) {  // Loop from 8 PM (20) to 3 AM (27)
                // Adjust time format to PM/AM, converting hours from 8 PM to 3 AM
                String time;
                if (hour >= 20 && hour < 24) {
                    time = (hour - 12) + "pm";  // PM hours from 8 to 11 PM
                } else if (hour == 24) {
                    time = "12am";  // Midnight (12 AM)
                } else {
                    time = (hour - 24) + "am";  // AM hours from 1 AM to 3 AM
                }

                output.write(String.format("@ %s\n", time));
                output.write("Samantha's Enjoyment Bar: " + "⚡".repeat(enjoymentLevelS) + "\n");

                // Print playing board
                printBoard(output);

                int roll = diceRoll(6);
                if (secondWind) {
                    roll += 2;
                    secondWind = false;
                }

                position = (position + roll) % encounters.length;

                String event = encounters[position];
                enjoymentLevelS = Math.min(enjoymentLevelS, 10);

                switch (event) {
                    case "🎶":
                        output.write("Samantha enjoyed some music 🎶\n");
                        enjoymentLevelS = Math.min(enjoymentLevelS + 1, 6);
                        break;
                    case "😎":
                        output.write("Samantha got excited talking to 😎\n");
                        enjoymentLevelS = Math.max(enjoymentLevelS + 1, 6);
                        break;
                    case "🚽":
                        output.write("Samantha got a second wind after a toilet break. + 2 next turn\n");
                        secondWind = true;
                        break;
                    case "👦":
                        output.write("Samantha met up with Alejandro.\n");
                        foundAlejandro = true;
                        break;
                    case "🤮":
                        output.write("Samantha is feeling sick... 🤮\n");
                        enjoymentLevelS = Math.max(enjoymentLevelS - 2, 0);
                        break;
                    case "🍸":
                        output.write("Samantha got dizzy from a cocktail... 🍸\n");
                        enjoymentLevelS = Math.min(enjoymentLevelS - 3, 0);
                        break;
                    case "🔐":
                        output.write("Samantha is back to the start! 🔐\n");
                        enjoymentLevelS = Math.min(enjoymentLevelS + 1, 6);
                        break;
                    case "👧":
                        output.write("Samantha made a new friend 👧\n");
                        enjoymentLevelS = Math.min(enjoymentLevelS + 1, 6);
                        break;
                    default:
                        break;
                }

                output.write(String.format("Samantha rolled %d.\n\n", roll));

                if (foundAlejandro) {
                    break;
                }
            }

            if (foundAlejandro) {
                if (enjoymentLevelS >= 5) {
                    output.write("Samantha ended the night ecstatic as she left with Alejandro.\n");
                } else if (enjoymentLevelS >= 3) {
                    output.write("Samantha ended the night with mediocre enjoyment as she left with Alejandro.\n");
                } else {
                    output.write("Samantha ended the night exhausted as she left with Alejandro.\n");
                }
            } else {
                output.write("Samantha never found Alejandro and left the club alone.\n");
            }

            output.close();
        }
    }

    public static void printBoard(FileWriter output) throws IOException {
        StringBuilder board = new StringBuilder("[");
        for (int i = 0; i < encounters.length; i++) {
            board.append(encounters[i]);
            if (i < encounters.length - 1) {
                board.append(", ");
            }
        }
        board.append("]");

        // Write the formatted board to output
        output.write(board.toString() + "\n");
    }

}