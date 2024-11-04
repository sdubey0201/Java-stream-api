import java.util.Arrays;
import java.util.List;

public class FindLongestStringInListUsingJava8IntSummaryStatistics {
    public static void main(String[] args) {
        // 1. names with different length
        List<String> names = Arrays.asList(
                "Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
        );
        int max = names.stream()
                .peek(System.out::print)
                .mapToInt(String::length)
                .peek(value -> System.out.println("=" + value))
                .summaryStatistics()
                .getMax();
        System.out.println(max);
    }
}
