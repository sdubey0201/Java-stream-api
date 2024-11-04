import java.util.Arrays;
import java.util.OptionalInt;

public class FindLongestStringInAnArraysUsingJava8StreamReduceMethod {
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
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .get();
        System.out.println(s);
        int reduce = Arrays.stream(names)
                .mapToInt(String::length)
                .reduce((Integer::max)).getAsInt();
        System.out.println(reduce);
    }
}
