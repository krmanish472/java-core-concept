package ControlStatements.DecisionMakingStatements;

public class IfElse {
    public static void main(String[] args) {
        // ### ODD_EVEN ###

        // defining a variable
        int number = 13;
        // check if the number is divisible by 2 or not
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }


        // ### LEAP YEAR ###
        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }

        // ### ELSE_IF_LADDER ###
        int marks = 65;

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }

        // ### POSITIVE_NEGATIVE ###
        int num = -13;
        if (num > 0) {
            System.out.println("POSITIVE");
        } else if (num < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
    }
}
