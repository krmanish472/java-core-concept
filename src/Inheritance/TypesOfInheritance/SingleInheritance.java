package Inheritance.TypesOfInheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Two two = new Two();
        two.printOne();
        two.printTwo();
    }

}

class One {
    public void printOne() {
        System.out.println("One");
    }
}

class Two extends One {
    public void printTwo() {
        System.out.println("Two");
    }
}
