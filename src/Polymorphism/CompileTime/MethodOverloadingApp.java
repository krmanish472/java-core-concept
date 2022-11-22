package Polymorphism.CompileTime;

public class MethodOverloadingApp {
    public static void main(String[] args) {
        Casio casio = new Casio();
        casio.add(2, 6);
        casio.add(2, 6, 8);
        casio.add(2, 8.5);
    }
}

class Casio {
    public int add(int i, int j) {
        return i + j;
    }

    public int add(int i, int j, int k) {
        return i + j;
    }

    public double add(int i, double j) {
        return i + j;
    }
}


/*
 * Method Overloading allows different methods to have the same name, but different signatures
 * where the signature can differ by --
 * number of input parameters or
 * type of input parameters,
 * or a mixture of both
 * Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java
 * */