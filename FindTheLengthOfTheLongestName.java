import java.util.Arrays;
import java.util.List;

public class FindTheLengthOfTheLongestName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        Integer i = names.stream()
                .map(String::length)
                .max(Integer::compareTo)
                .orElse(null);
                System.out.println(i);
    }
}
