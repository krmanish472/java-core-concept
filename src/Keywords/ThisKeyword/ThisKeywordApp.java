package Keywords.ThisKeyword;

public class ThisKeywordApp {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        // myDog.setName("Kramer");
        System.out.println(myDog.getName());
    }
}

class Dog {
    private String name;
    private int age;
    private String color;

    public Dog() {
        // calls another constructor - decides which to call based on signature
        // call to this() must be first statement in constructor
        this("Fido", 2);
        // this("Fido", 2, "White"); => this() as well super() can be used exactly once inside the constructor
        // super(); // we cannot use the this() and super() in the same constructor
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    // take myDog obj and set its "name" to name
    // to avoid confusion, "name" will be referred with this.name, where this is the current object
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /* public static void printStuff(){
        // not applicable
        // this.name;
    }*/
}

/*
 * this => refers to the current object
 * this is not allowed with static method and is allowed only with non-static method
 * as static method is used outside the context of any particular object of that class
 * we cannot use the this() and super() in the same constructor
 * this() as well super() can be used exactly once inside the constructor
 * */
