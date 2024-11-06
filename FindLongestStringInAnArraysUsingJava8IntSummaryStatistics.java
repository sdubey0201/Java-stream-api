import java.util.Arrays;

public class FindLongestStringInAnArraysUsingJava8IntSummaryStatistics {
    public static void main(String[] args) {
        String[] names = new String[] {
                "Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
        };
        int max = Arrays.stream(names)
                .peek(System.out::print)
                .mapToInt(String::length)
                .peek(value -> System.out.println("=" + value))
                .summaryStatistics()
                .getMax();
        System.out.println(max);


    }
}
