package Varargs;

public class VarargsApp {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(10, 30));
        System.out.println(calc.add(10, 30, 50));
    }
}

class Calc {
    public int add(int i, int j) {
        return i + j;
    }

    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
