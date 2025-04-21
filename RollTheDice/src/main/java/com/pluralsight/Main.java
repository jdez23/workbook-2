package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1;
        int roll2;

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i = 0; i < 100; i++) {

            // Roll  dice
            roll1 = dice.roll();
            roll2 = dice.roll();

            // Calculate sum of rolls
            int sum = roll1 + roll2;

            // Print result
            System.out.println("Roll 1: " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                count2++;
            } else if (sum == 4) {
                count4++;
            } else if (sum == 6) {
                count6++;
            } else if (sum == 7) {
                count7++;
            }
        }
        // Print all counts
        System.out.println("Count of 2: " + count2);
        System.out.println("Count of 4: " + count4);
        System.out.println("Count of 6: " + count6);
        System.out.println("Count of 7: " + count7);
    }
}