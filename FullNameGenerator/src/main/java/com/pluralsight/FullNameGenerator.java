package com.pluralsight;

import java.util.Scanner;
public class FullNameGenerator {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);

     String firstName = getStringInput(sc, "Write your first name: ");
     String middleName = getStringInput(sc, "Write your middle name: ");
     String lastName = getStringInput(sc, "Write your last name: ");
     String title = getStringInput(sc, "Write your title: ");

     System.out.println(firstName + middleName + lastName + title);

     firstName = firstName.replaceFirst(firstName.substring(0,1), firstName.substring(0,1));

     middleName = (middleName.length() == 1)? (middleName + "."): middleName;

     if ( ! title.isBlank() ) title = ", " + title;
     title = title.toUpperCase();

     System.out.println(firstLetterCapital(firstName) + " " + firstLetterCapital(middleName) + " " + firstLetterCapital(lastName) + title);


    }
    public static String getStringInput(Scanner scanner, String prompt)
    {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    public static String firstLetterCapital(String name)
    {
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
