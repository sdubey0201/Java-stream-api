import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamApiConvertStringArrayIntoHashMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("xxx","yyy", "zzz");
        //{“xxx”:0, “yyy” : 1, “zzz” : 2}
        LinkedHashMap<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(s -> s, list::indexOf, (integer, integer2) -> integer, LinkedHashMap::new));
        System.out.println(collect);
    }
}
