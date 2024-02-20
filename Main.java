package com.example.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        EvenNumber.findEvenNumber(Arrays.asList(34,56,46,35,89,25,11,70));
//        EvenNumber.findOddNumber(Arrays.asList(5,7,9,11,22,10,4,6));
//        EvenNumber.findOddAndEvenNumber(Arrays.asList(3,7,9,4,6,8,10,11,13,17));
//        NumberStartingWithOne.showNumberStartWithOne(Arrays.asList(1,23,12,45,16,67,17,66));
//        DuplicateElements.findDuplicate(Arrays.asList(1,4,7,8,4,7,10,90,1));
//          UniqueElements.FindUniqueValue(Arrays.asList(2,2,1,4,3,5,6,5,4));
//          MultipleOfFive.showMultipleOfFive(Arrays.asList(5,6,10,34,15));
//        CharacterCount.showCharaterCount("Communication");
//        CharacterCount.showCharacterFrequency("Communication");

//        A a = new A();
//        a.fun(null);

// How many male and female employees are there in the organization?
//        checkMaleAndFemaleEmp(getEmployeeList());
// Print the name of all departments in the organization?
//        showAllDepartment(getEmployeeList());
// What is the average age of male and female employees?
//        showAverageAgeMaleAndFemaleEmp(getEmployeeList());
//    Get the details of highest paid employee in the organization?
//        showHighestPaidEmployee(getEmployeeList());
//    Get the names of all employees who have joined after 2015?
//        showAllEmpNameWhoJoinedAfter2015(getEmployeeList());
//    Get the details of highest paid employee in the organization?
//        countEmpInEachDepartment(getEmployeeList());
//    What is the average salary of each department?
//        showAverageSalaryForEachDepartment(getEmployeeList());
//    Get the details of youngest male employee in the product development department?
//        showYoungestMaleEmpInEachDepartment(getEmployeeList());
//        showMostWorkingExperiencesInOrganizations(getEmployeeList());
//        showMaleAndFemaleEmpInDepartment(getEmployeeList());
//        showAverageSalaryMaleAndFemale(getEmployeeList());
//        showNameOfAllEmpInEachDepartment(getEmployeeList());
//       showAverageAndTotalSalary(getEmployeeList());
//        separateEmpUsingPartitions(getEmployeeList());
showOldestEmp(getEmployeeList());


    }



    //How many male and female employees are there in the organization?
     private  static void  checkMaleAndFemaleEmp(List<Employee> employees) {
         System.out.println("**** check Male & Female ****");
        Map<String,Long> result =employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
         System.out.println(result.toString());


     }
     // Print the name of all departments in the organization?
    private static void showAllDepartment(List<Employee> employees){
        System.out.println("**** show all Department  ****");
//     List<String> result = employees
//             .stream()
//             .map(Employee::getDepartment)
//             .distinct()
//             .collect(Collectors.toList());
//        System.out.println(result.toString());

        employees
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

    }

    //What is the average age of male and female employees?
    private static  void showAverageAgeMaleAndFemaleEmp(List<Employee>employees){
        System.out.println("**** show average age for Female and Male employee  ****");
//     List<String> result = employees
        Map<String,Double> result = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(result.toString());

    }

//    Get the details of highest paid employee in the organization?
private static void showHighestPaidEmployee(List<Employee>employees){
    System.out.println("**** show highest Paid  employee  ****");

//    Optional<Employee> employee = employees
//            .stream()
//            .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))

        Optional<Employee> employee = employees
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
    System.out.println(employee.get());


}

//    Get the names of all employees who have joined after 2015?
private static void showAllEmpNameWhoJoinedAfter2015(List<Employee> employees){
    System.out.println("**** show  all  employee who join after 2015  ****");
        List<String> result = employees
                .stream()
                .filter(employee -> employee.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .collect(Collectors.toList());
    System.out.println(result);
     employees
            .stream()
            .filter(employee -> employee.getYearOfJoining() > 2015)
            .map(Employee::getName)
             .forEach(System.out::println);
}
//    Count the number of employees in each department?
    private static void countEmpInEachDepartment(List<Employee>employees) {
        System.out.println("**** show Emp in each department ****");
        Map<String,Long> result = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,LinkedHashMap::new,Collectors.counting()));
        System.out.println(result);
        Set<Map.Entry<String, Long>> entries = result.entrySet();
        entries.forEach(entry->{
            System.out.println(entry.getKey()+" : "+entry.getValue());
        });

    }
//    What is the average salary of each department?
private static void showAverageSalaryForEachDepartment(List<Employee> employees){
        System.out.println("**** show average salary  department ****");
        Map<String,Double> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String,Double>>entries = result.entrySet();
        entries.forEach(entry->{
            System.out.println(entry.getKey()+" : "+entry.getValue());
        });
    }
//    Get the details of youngest male employee in the product development department?
    private static void showYoungestMaleEmpInEachDepartment(List<Employee>employees){
        System.out.println("**** show Male youngest Emp in Each department    department ****");
        Map<String,Optional<Employee>> result = employees.stream()
                .filter(employee -> Objects.equals(employee.getGender(), "Male"))
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
        Set<Map.Entry<String,Optional<Employee>>> entries = result.entrySet();
        entries.forEach(entry -> {
            System.out.println(entry.getKey()+" : "+entry.getValue().get().getName());
        });

    }
//    Who has the most working experience in the organization?
    private static void showMostWorkingExperiencesInOrganizations(List<Employee>employees){
        System.out.println("**** show Most working experiences in Organizations  ****");
      Optional<Employee> result = employees
              .stream()
              .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
              .findFirst();
        System.out.println(result.get());
        Optional<Employee> result1 = employees
                .stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(result1.get());

    }
//    How many male and female employees are there in the sales and marketing
    private static void showMaleAndFemaleEmpInDepartment(List<Employee>employees){
        System.out.println("**** show Male & Female Emp in Sales and marketing department  ****");
        Map<String,Long> result = employees
                .stream()
                .filter(employee -> "Sales And Marketing".equals(employee.getDepartment()))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        Set<Map.Entry<String,Long>> entries = result.entrySet();
        entries.forEach(entry->{
            System.out.println(entry.getKey()+" : "+entry.getValue());
        });
    }

//    What is the average salary of male and female employees?
    private static void showAverageSalaryMaleAndFemale(List<Employee>employees) {
        System.out.println("**** show average salary for male and female Emp   ****");
        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String,Double>>entries = result.entrySet();
        entries.forEach(entry->{
            System.out.println(entry.getKey()+" : "+entry.getValue());
        });
    }

//    List down the names of all employees in each department?
    private static void showNameOfAllEmpInEachDepartment(List<Employee>employees){
        System.out.println("**** show Name of all Emp in each department    ****");
        Map<String, List<Employee>> result = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String,List<Employee>>> entries = result.entrySet();
        entries.forEach(entry ->{
            System.out.println("Department Name is : "+entry.getKey());
            List<Employee>employee = entry.getValue();
            employee.forEach(employee1 -> {
                System.out.println(employee1.getName());
            });
        });
    }

//    What is the average salary and total salary of the whole organization?
    private static void showAverageAndTotalSalary(List<Employee>employees){
        System.out.println("**** show average salary and total salary in organizations     ****");
        DoubleSummaryStatistics doubleSummaryStatistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average : "+doubleSummaryStatistics.getAverage());
        System.out.println("Total : "+doubleSummaryStatistics.getSum());
        System.out.println(doubleSummaryStatistics.toString());

    }

//     Separate the employees who are younger or equal to 25 years from those
//    employees who are older than 25 years?
    private static void separateEmpUsingPartitions(List<Employee>employees){
        Map<Boolean,List<Employee>> result = employees
                .stream()
                .collect(Collectors.partitioningBy(employee -> employee.getAge()<=25));
        List<Employee>empYoungerThan25 = result.get(true);
        List<Employee>empOlderThan25 = result.get(false);
        System.out.println("**** Emp younger  than 25 year      ****");
        empYoungerThan25.forEach(System.out::println);
        System.out.println("**** Emp Older  than 25 year      ****");
        empOlderThan25.forEach(System.out::println);
    }

//    Who is the oldest employee in the organization? What is his age and which department he belongs to?
    private  static void  showOldestEmp(List<Employee>employees){
        System.out.println("**** show the oldest Emp ****");
        Optional<Employee>employee = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        System.out.println(employee.get());

    }



    private static List<Employee> getEmployeeList(){
        List<Employee>employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        return employeeList;
    }
}

