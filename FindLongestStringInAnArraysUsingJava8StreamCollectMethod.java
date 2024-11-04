import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindLongestStringInAnArraysUsingJava8StreamCollectMethod {
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
                .collect(Collectors.maxBy(Comparator.comparingInt(String::length)))
                .orElse(null);
        System.out.println(s);
        int max = Arrays.stream(names)
                .collect(Collectors.summarizingInt(String::length))
                .getMax();
        System.out.println(max);

    }
}
