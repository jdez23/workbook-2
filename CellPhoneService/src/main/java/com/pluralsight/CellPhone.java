package com.pluralsight;

import java.util.Scanner;

public class CellPhone {
    Scanner scanner = new Scanner(System.in);

    public int serialNumber;
    public String model;
    public String carrier;
    public String phoneNumber;
    public String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public int getSerialNumber() {
        System.out.println(this.serialNumber);
        return this.serialNumber;
    }

    public void setSerialNumber() {
        System.out.println("Enter serial number: ");
        this.serialNumber = scanner.nextInt();
        scanner.nextLine();
    }

    public String getModel() {
        System.out.println(this.model);
        return this.model;
    }

    public void setModel() {
        System.out.println("Enter model: ");
        this.model = scanner.nextLine();
    }

    public String getCarrier() {
        System.out.println(this.carrier);
        return this.carrier;
    }

    public void setCarrier() {
        System.out.println("Enter your carrier: ");
        this.carrier = scanner.nextLine();
    }

    public String getPhoneNumber() {
        System.out.println(this.phoneNumber);
        return this.phoneNumber;
    }

    public void setPhoneNumber() {
        System.out.println("Enter your phone number: ");
        this.phoneNumber = scanner.nextLine();
    }

    public String getOwner() {
        System.out.println(this.owner);
        return this.owner;
    }

    public void setOwner() {
        System.out.println("Enter your name: ");
        this.owner = scanner.nextLine();
    }

    public void createCellPhone () {
        setPhoneNumber();
        setSerialNumber();
        setModel();
        setCarrier();
        setOwner();
    }

    public void getCellPhone () {
        getPhoneNumber();
        getSerialNumber();
        getModel();
        getCarrier();
        getOwner();
    }

    public void dial (String phoneNumber) {
        System.out.println(this.owner + " is calling " + phoneNumber);
    }

    public static void display (CellPhone cellPhone) {
        cellPhone.getCellPhone();
    }

}
