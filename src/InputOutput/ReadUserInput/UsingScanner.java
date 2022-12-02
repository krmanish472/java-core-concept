package InputOutput.ReadUserInput;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // Getting integer input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

        // closing the scanner object
        input.close();
    }
}

/*
* nextLong(),
* nextFloat(),
* nextDouble(), and
* next() methods to get
*
* long,
* float,
* double, and
* string
*
* input respectively from the user
* */
