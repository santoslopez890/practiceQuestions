import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    private static String input = "tacocat";

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverse(input));
    }

    public static Boolean reverse(String input) {
        
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();

        if (String.valueOf(reversedString).equals(input)) {
            return true;
        }
        return false;
    }
}
