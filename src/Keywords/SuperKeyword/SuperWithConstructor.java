package Keywords.SuperKeyword;

public class SuperWithConstructor {
    public static void main(String[] args) {
        // in A
        // in B
        // when object of sub class is created it will call constructor of super class as well
        B b = new B();

        // in A parameterized
        // in B parameterized
        B b2 = new B(5);
    }
}

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in A parameterized");
    }
}

class B extends A {
    public B() {
        super(); // this is assumed and not required to add explicitly => calls parent constructor
        System.out.println("in B");
    }

    public B(int i) {
        // super(); => present by default
        // to execute parameterized one:
        super(5);
        System.out.println("in B parameterized");
    }
}

/*
 * super keyword is a reference variable that is used to refer to parent class objects
 * call to super() must be the first statement in the derived class constructor
 * if a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
 * if the superclass does not have a no-argument constructor, you will get a compile-time error. The object does have such a constructor, so if the Object is the only superclass, there is no problem.
 * */

