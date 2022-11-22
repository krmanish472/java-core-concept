package Keywords.SuperKeyword.Advance;

public class Cat extends Animal {
    String catFoodPref;

    public Cat() {

    }

    public Cat(int age, String name, String catFoodPref) {
        // age and name will be set here
        super(age, name); // => should be very first line
        this.catFoodPref = catFoodPref;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow Meow Meow");
        // super.eat(); is same as eat() as there is no override
    }

    public void jump() {
        super.makeNoise();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catFoodPref='" + catFoodPref + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

/*
 * It is not required that super method be called in override method only
 * It can be called in any non static method
 * */