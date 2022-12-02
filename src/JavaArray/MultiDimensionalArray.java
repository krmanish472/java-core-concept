package JavaArray;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // declaration and instantiation
        int[][] arr = new int[3][3]; //3 row and 3 column
        // initialization
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        // 1 2 3
        // 4 5 6
        // 7 8 9

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // print row by row
                System.out.print(arr[i][j] + " ");
            }
            // next line
            System.out.println();
        }

        // declaration, instantiation and initialization 2D array
        int[][] numbers = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
        //printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
