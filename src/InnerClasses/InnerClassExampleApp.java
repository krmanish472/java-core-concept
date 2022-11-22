package InnerClasses;

public class InnerClassExampleApp {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.heyThere();

        // create object of inner class
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.whatsUp();

        // create object of static inner class
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.whatsUp();

    }
}
