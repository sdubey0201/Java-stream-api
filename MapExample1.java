import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> collect = integers.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<String> list = Arrays.asList("hello", "world");
        List<String> list1 = list.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(list1);
        String collect1 = list1.stream()
                .collect(Collectors.joining());
        System.out.println(collect1);
    }
}
