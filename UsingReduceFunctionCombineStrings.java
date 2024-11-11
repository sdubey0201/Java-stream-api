import java.util.Arrays;
import java.util.List;

public class UsingReduceFunctionCombineStrings {
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
        String s1 = names.stream()
                .reduce((s, s2) -> s + "-" + s2)
                .orElse(null);
        System.out.println(s1);
    }
}