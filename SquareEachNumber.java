import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEachNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = numbers.stream()
                .map(a -> a * a)
                .toList();
        System.out.println(collect);
    }
}
