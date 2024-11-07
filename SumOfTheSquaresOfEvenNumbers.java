import java.util.Arrays;
import java.util.List;

public class SumOfTheSquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer*integer)
                .mapToInt(value -> value)
                .sum();
        System.out.println(sum);
    }
}
