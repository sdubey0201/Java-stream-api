package com.example1;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamApiFlatMap {
    public static void main(String[] args) {
        List<Test7.StudentGrade> studentGrades = new ArrayList<>();
        Map<String, Integer> val = new HashMap<>();
        val.put("Math", 90);
        val.put("Physics", 85);
        val.put("History", 78);
        Test7.StudentGrade student1 = new Test7.StudentGrade("Student1", val);
        Map<String, Integer> val2 = new HashMap<>();
        val2.put("Math", 92);
        val2.put("Physics", 88);
        val2.put("History", 75);
        Test7.StudentGrade student2 = new Test7.StudentGrade("Student2", val2);
        Map<String, Integer> val3 = new HashMap<>();
        val3.put("Math", 85);
        val3.put("Physics", 95);
        val3.put("History", 80);
        Test7.StudentGrade student3 = new Test7.StudentGrade("Student3", val3);
        studentGrades.add(student1);
        studentGrades.add(student2);
        studentGrades.add(student3);
        studentGrades.stream()
                .flatMap(studentGrade -> studentGrade.grades.entrySet().stream())
                .collect(Collectors.groupingBy(stringIntegerEntry -> stringIntegerEntry.getKey(),Collectors.averagingInt(value -> value.getValue())));
        studentGrades.stream()
                .flatMap(studentGrade -> studentGrade.grades.entrySet().stream())
                .max(Comparator.comparingInt(Map.Entry::getValue));

    }
    static class StudentGrade {
        String name;
        Map<String, Integer> grades;

        public StudentGrade(String student2, Map<String, Integer> val2) {
            this.name = student2;
            this.grades = val2;
        }
    }
}
