import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        occurrenceOfEachCharacter("Hello World");
    }
    
    public static void occurrenceOfEachCharacter(String input){
        if(Objects.isNull(input) || input.isEmpty()){
            return ;
        }
      Map<String,Long> charMapping =  Arrays.stream(input.split(""))
              .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        System.out.println(charMapping);
        
        
    }
}