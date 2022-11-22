package Polymorphism.RunTime;

public class MethodOverridingApp {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}

class A {
    public void show() {
        System.out.println("in A show");
    }

    public void display() {
        System.out.println("in A display");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in B show");
    }
}

/*
 * Method Overriding
 * sub class overrides super class method
 * required when we extend a class but want to have custom implementation for any methods
 * */

/*
 * Overriding and constructor : We can not override constructor as parent and child class can never have constructor with same name
 * Constructor name must always be same as Class name
 * */
