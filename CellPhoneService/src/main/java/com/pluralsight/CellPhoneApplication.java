package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone userCellPhone1 = new CellPhone();
        CellPhone userCellPhone2 = new CellPhone();

        System.out.println("Hello, User 1!");
        userCellPhone1.createCellPhone();
        System.out.println("The following cell phone information for user1 is:");
        userCellPhone1.getCellPhone();

        System.out.println("Hello, User 1!");
        userCellPhone2.createCellPhone();
        System.out.println("The following cell phone information for user2 is:");
        userCellPhone2.getCellPhone();

        userCellPhone1.dial(userCellPhone2.phoneNumber);
    }
}
