package JavaArray;

public class App {
    public static void main(String[] args) {
        //declaration and instantiation
        int[] a = new int[5];
        //initialization
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
        // traversing array
        for (int value : a) System.out.println(value);

        // declaration, instantiation and initialization
        int[] arr = {33, 3, 4, 5};
        for (int i = 0; i < arr.length; i++)//length is the property of array
            System.out.println(arr[i]);
    }
}
