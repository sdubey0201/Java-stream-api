package com.example.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void findDuplicate(List<Integer> values){
        Set<Integer> set = new HashSet<>();
        List<Integer> result = values.stream()
                .filter(a->!set.add(a))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
