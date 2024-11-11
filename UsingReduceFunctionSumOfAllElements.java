import java.util.Arrays;
import java.util.List;

public class UsingReduceFunctionSumOfAllElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);
        Integer i = numbers.stream()
                .reduce((integer, integer2) -> integer+integer2).orElse(0);
        System.out.println(i);
        Integer reduce = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
