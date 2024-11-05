import java.util.Arrays;
import java.util.stream.Collectors;

public class FindIfTwoStringIsAnagramUsingStreamApi {
    public static void main(String[] args) {
        String s1 ="below";
        String s2 = "elbow";
        System.out.println("isAnagram : "+isAnagram(s1,s2));

    }
    public static  boolean isAnagram(String s1,String s2){
        boolean flage = false;
        if (s1.length()!=s2.length()){
            return flage;
        }
        String string = Arrays.stream(s1.split(""))
                .sorted()
                .collect(Collectors.joining());
        String string2 = Arrays.stream(s2.split(""))
                .sorted()
                .collect(Collectors.joining());
        if (string.equalsIgnoreCase(string2)){
            flage = true;
        }
        return flage;
    }
}
