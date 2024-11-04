import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class FindLongestStringInAnArraysUsingJava8StreamMaxMethod {
    public static void main(String[] args) {
        // 1. names with different length
        String[] names = new String[] {
                "Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
        };
        String s = Arrays.stream(names)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(s);
        int max = Arrays.stream(names)
                .mapToInt(String::length)
                .max()
                .getAsInt();
        System.out.println(max);



    }
}
