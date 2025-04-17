package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Score {
    Scanner scanner = new Scanner(System.in);

    public void getWinner() {

        System.out.println("Enter score in following format: Home:Visitor|21:9 ");
        String score = scanner.nextLine();

        String[] scores = score.split(Pattern.quote("|"));

        String[] teams = scores[0].split(Pattern.quote(":"));
        String[] points = scores[1].split(Pattern.quote(":"));

        String homeTeam = teams[0];
        String visitingTeam = teams[1];

        int homePoints = Integer.parseInt(points[0]);
        int visitingPoints = Integer.parseInt(points[1]);

        if (homePoints > visitingPoints) {
            System.out.println("The winner: " + homeTeam);
        } else {
            System.out.println("The winner: " + visitingTeam);
        }

    }
}
