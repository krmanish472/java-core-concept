package InnerClasses;

public class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey There!");

        // class at method level
        class LocalInnerClass {
            String localInnerClassVariable = "Here's Johnny";

            public void print() {
                System.out.println(localInnerClassVariable);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.print();
    }

    // inner class
    public class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up from the Inner Class");
        }
    }

    // static inner class - suggested use is static
    public static class StaticInnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up from the Static Inner Class");
        }
    }

}
