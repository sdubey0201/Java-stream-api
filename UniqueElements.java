package com.example.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void FindUniqueValue(List<Integer>values) {
        List<Integer>result = values.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
