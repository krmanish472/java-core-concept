package Inheritance;

public class App {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int sum = c1.add(2, 3);
        int sub = c1.sub(10, 3);
        System.out.println("Sum is: " + sum + "\n" + "Sub is: " + sub);
    }
}

// super/parent/base
class Adder {
    public int add(int i, int j) {
        return i + j;
    }
}

// sub/child/derived
class Calculator extends Adder {
    public int sub(int i, int j) {
        return i - j;
    }
}
