import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class PasswordReadWrite {

    private static final String DATA_FILE = "passwords.txt";
    private static Scanner in;
    private static BufferedWriter out;

    public static void writeString(String s) {
        // check to see if out is assigned
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            } catch (Exception e) {
                System.err.println("Cannot open file for output!");
                e.printStackTrace();
            }
        }

        try {
            out.write(s);
            out.newLine();
        } catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }
    }   
}
