package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone userCellPhone1 = new CellPhone();
        CellPhone userCellPhone2 = new CellPhone();

        System.out.println("Hello, User 1!");
        userCellPhone1.createCellPhone();

        System.out.println("Hello, User 1!");
        userCellPhone2.createCellPhone();

        userCellPhone1.dial(userCellPhone2.phoneNumber);

        CellPhone.display(userCellPhone1);
        CellPhone.display(userCellPhone2);
    }
}
