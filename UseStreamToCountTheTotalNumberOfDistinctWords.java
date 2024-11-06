import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseStreamToCountTheTotalNumberOfDistinctWords {
    public static void main(String[] args) {
        System.out.println("UseStreamToCountTheTotalNumberOfDistinctWords");
        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );
        long count = Arrays.stream(sentences.stream()
                        .collect(Collectors.joining())
                        .split(" "))
                .peek(System.out::println)
                .distinct()
                .count();
        System.out.println(count);


    }
}
