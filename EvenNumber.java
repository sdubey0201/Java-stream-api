package com.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void findEvenNumber(List<Integer> values){
    /*
        approach 1
          */
        values.stream().filter(value -> value%2==0).forEach(System.out::println);
        List<Integer> result = values.stream().filter(a-> a%2==0).collect(Collectors.toList());
        System.out.println(result);

    }
    public static void findOddNumber(List<Integer> values){
    /*
        approach 1
          */
        values.stream().filter(value -> value%2!=0).forEach(System.out::println);
        List<Integer> result = values.stream().filter(a-> a%2!=0).collect(Collectors.toList());
        System.out.println(result);

    }

    public static void findOddAndEvenNumber(List<Integer> values){
        Map<Boolean,List<Integer>> result = values.stream().collect(Collectors.partitioningBy(n->n%2==0));
        List<Integer> oddValues = result.get(false);
        List<Integer> evenValues = result.get(true);
        System.out.println(oddValues);
        System.out.println(evenValues);

    }

}
