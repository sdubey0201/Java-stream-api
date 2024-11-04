import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindLongestStringInListUsingJava8StreamCollectMethod {
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
        Optional<String> collect = names.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(String::length)));
        System.out.println(collect.orElse(null));
        int max = names.stream()
                .collect(Collectors.summarizingInt(String::length))
                .getMax();
        System.out.println("length "+max);
    }
}
