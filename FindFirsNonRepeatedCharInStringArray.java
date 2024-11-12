import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirsNonRepeatedCharInStringArray {
    public static void main(String[] args) {
        String [] arr = new String[]{"array", "apple", "rat"};
        Arrays.stream(arr)
                .map(String::chars)
                .iterator()
                .forEachRemaining(intStream -> {
                    Character c = intStream.mapToObj(value -> (char) value)
                            .map(Character::toLowerCase)
                            .collect(Collectors.groupingBy(character -> character, LinkedHashMap::new, Collectors.counting()))
                            .entrySet()
                            .stream()
                            .filter(characterLongEntry -> characterLongEntry.getValue() == 1L)
                            .map(Map.Entry::getKey)
                            .findFirst()
                            .get();
                    System.out.println(c);
                });
    }
}
