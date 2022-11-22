package Keywords.FinalKeyword;

public class FinalWithVariable {
    public static void main(String[] args) {

    }
}

class A {
    final int num = 10; // => constant
    final String DAY;

    public A() {
        // can not change a final variable
        // num = 30;

        // final variable becomes constant after the value is assigned once
        DAY = "Monday";

        // DAY = "Tuesday"; // => not valid
    }
}
