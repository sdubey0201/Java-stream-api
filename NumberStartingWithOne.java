package com.example.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
    public static void showNumberStartWithOne(List<Integer> values){
        values.stream()
                .map(a->a+"")
                .filter(a->a.startsWith("1"))
                .forEach(System.out::println);

        List<String> list =values.stream()
                .map(a->a+"")
                .filter(a->a.startsWith("1"))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);

    }

}
