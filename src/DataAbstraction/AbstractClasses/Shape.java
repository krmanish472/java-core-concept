package DataAbstraction.AbstractClasses;

abstract class Shape {
    String color;

    // abstract class can have the constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // these are abstract methods
    abstract double area();

    abstract void someMethod();

    public abstract String toString();

    // this is a concrete method
    public String getColor() {
        return color;
    }
}


/*
 * "abstract" can be used with class and method
 * abstract class can have abstract as well as non-abstract(concrete) functions
 * abstract method must be in abstract class, if we make method abstract, class should also be made abstract
 * There can be no object of an abstract class
 * i.e, an abstract class can not be directly instantiated with the new operator
 * An abstract class can have parameterized constructors and the default constructor is always present in an abstract class
 * */