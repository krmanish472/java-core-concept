package ControlStatements.JumpStatements;

public class BreakStatement {
    public static void main(String[] args) {
        // find if 5 exists in the list
        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        for (int i : arr) {
            if (i == 5) {
                //breaking the loop
                System.out.println("Found 5");
                break;
            }
            // makes sure that after 5, the loop does not exists
            System.out.println(i);
        }

        //outer loop
//        for (int i = 1; i <= 3; i++) {
//            //inner loop
//            for (int j = 1; j <= 3; j++) {
//                if (i == 2 && j == 2) {
//                    //using break statement inside the inner loop
//                    break;
//                }
//                System.out.println(i + " " + j);
//            }
//        }
    }
}

/*
 * When break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
 * break statement is used to break loop or switch statement.
 * It breaks the current flow of the program at specified condition. I
 * In case of inner loop, it breaks only inner loop.
 * We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.*/
