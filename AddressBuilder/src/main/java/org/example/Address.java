package org.example;

import java.util.Scanner;

public class Address {
    public static Scanner scanner = new Scanner(System.in);

    private String name;
    private String billingAddress;
    private String shippingAddress;

    public void BuildAddress() {

        // Introduction
        System.out.print("Hello! Please enter is your full name: ");
        this.name = scanner.nextLine();

        BuildBillingAddress();
        BuildShippingAddress();
        System.out.println();
        DisplayInfo();

    }

    public void BuildBillingAddress () {

        // Append all user's inputs
        StringBuilder appendBilling = new StringBuilder();

        System.out.println("Enter billing street and unit number: ");
        appendBilling.append(scanner.nextLine() + "\n");

        System.out.println("Enter  billing city: ");
        appendBilling.append(scanner.nextLine() + ", ");

        System.out.println("Enter  billing state: ");
        appendBilling.append(scanner.nextLine() + " ");

        System.out.println("Enter billing zip code: ");
        appendBilling.append(scanner.nextLine());

        //adds new info to the template
        billingAddress = appendBilling.toString();
    }

    // Build shipping address
    public void BuildShippingAddress(){
        StringBuilder appendShipping = new StringBuilder();

        System.out.print("Enter shipping street and unit number: ");
        appendShipping.append(scanner.nextLine() + "\n");

        System.out.print("Enter shipping city: ");
        appendShipping.append(scanner.nextLine() + ", ");

        System.out.print("Enter shipping state: ");
        appendShipping.append(scanner.nextLine() + " ");

        System.out.print("Enter shipping zip code: ");
        appendShipping.append(scanner.nextLine());

        shippingAddress = appendShipping.toString();
    }

    // Displays all variables
    public void DisplayInfo(){
        System.out.println(name + "\n");
        System.out.println();
        System.out.println("Billing Address:");
        System.out.println(billingAddress + "\n");
        System.out.println();
        System.out.println("Shipping Address:");
        System.out.println(shippingAddress);
    }

}
