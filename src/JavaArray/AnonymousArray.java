package JavaArray;

public class AnonymousArray {
    public static void main(String[] args) {
        // passing anonymous array to method
        printArray(new int[]{10, 22, 44, 66});
    }

    static void printArray(int[] arr) {
        for (int value : arr) System.out.println(value);
    }
}
