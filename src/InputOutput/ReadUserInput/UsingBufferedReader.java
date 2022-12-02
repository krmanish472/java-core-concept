package InputOutput.ReadUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReader {
    public static void main(String[] args) {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Enter ");
            // Reading data using readLine
            // reading string
            String name = reader.readLine();

            // Printing the read line
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
* To read other types, we use functions like Integer.parseInt(), Double.parseDouble().
* To read multiple values, we use split()
* */