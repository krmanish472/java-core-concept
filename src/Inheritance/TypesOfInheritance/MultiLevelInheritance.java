package Inheritance.TypesOfInheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.printA();
        obj.printB();
        obj.printC();
    }

}

class A {
    public void printA() {
        System.out.println("A");
    }
}

class B extends A {
    public void printB() {
        System.out.println("B");
    }
}

class C extends B {
    public void printC() {
        System.out.println("C");
    }
}
