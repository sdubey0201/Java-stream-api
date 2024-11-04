import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestStringInListUsingJava8StreamMaxMethod {
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
        String s = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(s);
    }
}
