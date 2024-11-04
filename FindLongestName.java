import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindLongestName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        String s = names.stream()
                 .max(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(s);

    }
}
