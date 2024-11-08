import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsingStringApiFindSecondHighestOfArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4,3,2,7,1,5,9);
        Integer i = list1.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(0);
        System.out.println(i);

    }
}

