package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void getName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();

        System.out.println("What is your middle initial? ");
        String middleName = scanner.nextLine();
        middleName = middleName.trim().concat(". ");

        System.out.println("What is your last name? ");
        String lastName = scanner.nextLine();
        lastName = lastName.trim();

        System.out.println("Do you have a suffix? ");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();

        System.out.println("Your full name is: " + firstName + " " + middleName + lastName + ", " + suffix);

    }

}
