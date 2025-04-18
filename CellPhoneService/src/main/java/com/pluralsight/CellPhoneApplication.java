package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone userCellPhone1 = new CellPhone();
        CellPhone userCellPhone2 = new CellPhone();
        CellPhone userCellPhone3 = new CellPhone(12345679, "iPhone 14", "Verizon","1-000-000-0000","Roku");

        System.out.println("Hello, User 1!");
        userCellPhone1.createCellPhone();

        System.out.println("Hello, User 2!");
        userCellPhone2.createCellPhone();

        userCellPhone1.dial(userCellPhone2.phoneNumber);

        CellPhone.display(userCellPhone1);
        CellPhone.display(userCellPhone2);
        CellPhone.display(userCellPhone3);
    }
}
