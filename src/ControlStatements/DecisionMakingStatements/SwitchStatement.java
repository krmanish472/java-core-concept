package ControlStatements.DecisionMakingStatements;

public class SwitchStatement {
    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

    public static void main(String[] args) {
        //Declaring a variable for switch expression
        int number = 20;
        //Switch expression
        switch (number) {
            //Case statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            //Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        // Program to check Vowel or Consonant
        // char ch = 'o';
        char ch = 'p';
        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

        // Java Switch Statement is fall-through
        int num = 20;
        switch (num) {
            //switch cases without break statements
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("Not in 10, 20 or 30");
        }
        // OUTPUT:
        // 20
        // 30
        // Not in 10, 20 or 30

        // ### Java Enum in Switch Statement ###

        Day[] DayNow = Day.values();
        for (Day Now : DayNow) {
            switch (Now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}

/*
 * There can be one or N number of case values for a switch expression.
 * case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
 * case values must be unique. In case of duplicate value, it renders compile-time error.
 * switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
 * Each case statement can have a break statement which is optional.
 * When control reaches to the break statement, it jumps the control after the switch expression.
 * If a break statement is not found, it executes the next case.
 * The case value can have a default label which is optional
 * */