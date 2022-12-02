package InputOutput.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {

            String[] names = {"John", "Carl", "Jerry"};
            // writes in src folder
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
            writer.write("Writing to a file");
            writer.write("\nHere is another line");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
