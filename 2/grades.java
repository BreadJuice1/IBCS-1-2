package com.company;
import java.util.Scanner;

public class grades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total points for the test");
        double totalscore = input.nextInt();
        System.out.println("Enter your score on the test");
        double subjectscore = input.nextInt();
        double percent = subjectscore / totalscore *100;
        char result;
        if (percent >= 90) {
            result = 'A';
        } else if (percent < 90 && percent >= 80) {
            result = 'B';
        } else if (percent < 80 && percent >= 70) {
            result = 'C';
        } else if (percent < 70 && percent >= 60) {
            result = 'D';
        } else if (percent < 60) {
            result = 'F';
        } else {
            result = 'X';
        }
        System.out.println("Your percentage is " + percent + " and your grade is " + result + ".");
    }
}