import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseStreamAPIToFindTheConcatenationOfTheFirstTwoWordsThatHaveEvenLengths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String collect = words.stream()
                .filter(s -> s.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
