package ControlStatements.Loops;

public class ForLoop {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // for each loop
        int[] arr = {12, 23, 44, 56, 78};
        for (int i : arr) {
            System.out.println(i);
        }

        // infinite loop
//        for(;;){
//            System.out.println("infinitive loop");
//        }
    }
}
