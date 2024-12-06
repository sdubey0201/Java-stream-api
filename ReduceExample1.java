import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> reduce = integers.stream()
                .reduce((integer, integer2) -> integer + integer2);
        System.out.println(reduce.get());
        Integer reduce1 = integers.stream()
                .reduce(1, (integer, integer2) -> integer * integer2);
        System.out.println(reduce1);


    }
}
