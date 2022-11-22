package Keywords.SuperKeyword;

public class SuperWithVariables {

    public static void main(String[] args) {
        Car small = new Car();
        small.changeNum();
        small.display();
    }
}

class Vehicle {
    int maxSpeed = 120;
    int num = 100;
}

class Car extends Vehicle {
    int maxSpeed = 180;
    int num = 50;

    void changeNum() {
        num = 60;
        super.num = 110;
    }

    void display() {
        System.out.println("Maximum Speed: "
                + super.maxSpeed); // 120
        System.out.println("num in sub: " + num);
        System.out.println("num in super: " + super.num);
    }


}
