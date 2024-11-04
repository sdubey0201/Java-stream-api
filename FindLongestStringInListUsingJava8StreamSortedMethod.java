import java.util.Arrays;
import java.util.List;

public class FindLongestStringInListUsingJava8StreamSortedMethod {
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
                .sorted((s1,s2)->s1.length()>s2.length()?-1:1)
                .findFirst()
                .orElse(null);
        System.out.println(s);


    }
}
