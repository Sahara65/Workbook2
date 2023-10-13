package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        // Scanning for user input
        Scanner sc = new Scanner(System.in);
        // Multi-line prompt to instruct the user as well as receive input
        String fullName = getStringInput(sc, """
                    This is the Full Name Parser!
                    Please use either format:
                    (First, Last) OR (First, Middle, Last)
                    Now, begin by entering your name:
                     """);
        // This will split the names by separating them with a space
        String[] names = fullName.split(" ");

        // This switch statement checks for how many names the user has provided
        // If only 2 names were given, it will print out 2 names
        // If 3 names were given, it will print all 3 names
        // If instructions were not followed, then the user would receive the default message
        switch(names.length){
            case 2:
                System.out.printf("First name : %s\nMiddle name : (none)\nLast name  : %s", names[0], names[1]);
                break;
            case 3:
                System.out.printf("First name : %s\nMiddle name: %s\nLast name  : %s", names[0], names[1], names[2]);
                break;
            default:
                System.out.println("Cannot parse that, sorry!");

        }
    }
    // Defining 'getStringInput' with Scanner and prompt
    // This will print the prompt, reads input from user,-
    // then trims any extra spaces before returning
    public static String getStringInput(Scanner scanner, String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim( );
    }

}
