package Keywords.StaticKeyword;

public class StaticWithClass {
    private static String str = "GeeksforGeeks";

    static class MyNestedClass {
        public void display() {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StaticWithClass.MyNestedClass myNestedClass
                = new StaticWithClass.MyNestedClass();
        myNestedClass.display();
    }
}

/*
 * class can be made static only if it is a nested class i.e inner class
 * */