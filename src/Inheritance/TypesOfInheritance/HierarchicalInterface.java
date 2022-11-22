package Inheritance.TypesOfInheritance;

public class HierarchicalInterface {
    public static void main(String[] args) {
        Delta delta = new Delta();
        delta.print_Alpha();
        delta.print_Delta();

        Gamma gamma = new Gamma();
        gamma.print_Alpha();
        gamma.print_Gamma();

        Beta beta = new Beta();
        beta.print_Alpha();
        beta.print_Beta();
    }
}

class Alpha {
    public void print_Alpha() {
        System.out.println("Alpha");
    }
}

class Beta extends Alpha {
    public void print_Beta() {
        System.out.println("Beta");
    }
}

class Gamma extends Alpha {
    public void print_Gamma() {
        System.out.println("Gamma");
    }
}

class Delta extends Alpha {
    public void print_Delta() {
        System.out.println("Delta");
    }
}
