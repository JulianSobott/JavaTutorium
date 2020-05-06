import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Can't read line try again;");
        }
        return "Wrong input";
    }

    public static int readInt() {
        try {
            return Integer.parseInt(readLine().trim());
        }catch (NumberFormatException e) {
            System.out.println("Input is not an integer");
            return -1;
        }
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return readInt();
    }

    public static String readLine(String prompt) {
        System.out.print(prompt);
        return readLine();
    }
}
