package com.pluralsight;

public class TestStatistics {

    private double[] testScores = { 7, 10, 23, 33, 34, 54, 63, 77, 88, 99};

    private double average;
    private double highScore;
    private double lowScore;

    public void checkScores(){
        setAverage();
        setHighestScore();
        setLowestScore();
        displayInfo();
    }

    public void setAverage(){
        double sum = 0;
        int numberOfScores = testScores.length;

        for (double testScore : testScores){
            sum += testScore;
        }

        this.average = sum / numberOfScores;
    }

    public void setHighestScore(){
        double compareValue = 0;

        for (double testScore : testScores){
            if(testScore > compareValue){
                compareValue = testScore;
            }
        }
        this.highScore = compareValue;
    }

    public void setLowestScore(){
        double compareValue = 100;

        for (double testScore : testScores){
            if(testScore < compareValue){
                compareValue = testScore;
            }
        }
        this.lowScore = compareValue;
    }

    public void displayInfo(){
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highScore);
        System.out.println("Lowest: " + lowScore);
    }

}