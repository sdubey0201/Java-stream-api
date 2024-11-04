import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindLongestStringInListUsingJava8CollectionMaxMethod {
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
        String max = Collections.max(names, Comparator.comparing(String::length));
        System.out.println(max);
    }
}
