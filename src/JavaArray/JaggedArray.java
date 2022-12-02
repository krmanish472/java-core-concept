package JavaArray;

public class JaggedArray {
    public static void main(String[] args) {
        //declaring a 2D array with odd columns
        int[][] arr = new int[3][];
        // row1 => 3 column
        arr[0] = new int[3];
        // row2 => 4 column
        arr[1] = new int[4];
        // row3 => 2 column
        arr[2] = new int[2];

        //initializing a jagged array
        int count = 0;
        // arr.length => 3 [rows]
        for (int i = 0; i < arr.length; i++)
            // arr[i].length => 3, 4, 2 [columns for each row]
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        //printing the data of a jagged array
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();//new line
        }

        System.out.println("Class name for Array");

        Class c = arr.getClass();
        String name = c.getName();
        System.out.println(name);
    }
}

// OUTPUT:
//  0 1 2
//  3 4 5 6
//  7 8
