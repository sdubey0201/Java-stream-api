import java.util.Arrays;
import java.util.stream.Collectors;

public class FindWordFrequency
{
    public static void main(String[] args) {
        String str = "Java is object oriented Language! Lets Create a Java program now";
        String [] arraystr = str.split(" ");
        Arrays.stream(arraystr)
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()))
                .entrySet()
                .stream()
//                .filter(stringLongEntry -> stringLongEntry.getValue()>1)
                .forEach(stringLongEntry -> {
                    System.out.print(stringLongEntry.getKey()+" ");
                    System.out.println(stringLongEntry.getValue());
                });
    }
}
