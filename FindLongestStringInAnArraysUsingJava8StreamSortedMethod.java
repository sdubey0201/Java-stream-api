import java.util.Arrays;

public class FindLongestStringInAnArraysUsingJava8StreamSortedMethod {
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
                .sorted((s1, s2) -> s1.length() > s2.length() ? -1 : 1)
                .findFirst().orElse(null);
        System.out.println(s);

        int i = Arrays.stream(names)
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println(i);


    }
}
