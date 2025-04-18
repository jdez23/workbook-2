package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        System.out.println("Hello, User!");

        CellPhone userCellPhone = new CellPhone();
        userCellPhone.createCellPhone();
        System.out.println("The following cell phone information is:");
        userCellPhone.getCellPhone();
    }
}
