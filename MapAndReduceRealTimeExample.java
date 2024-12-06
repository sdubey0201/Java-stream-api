import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceRealTimeExample {
    public static void main(String[] args) {
//        Scenario:
//        You have a list of customer orders,
//        and you want to calculate the total revenue from those orders.
//        Each order contains a product, quantity, and price.
//        You will use map() to extract the total price for each order,
//        and then use reduce() to sum those prices and get the total revenue.

        List<Order> orders = Arrays.asList(
                new Order("Laptop", 1, 1200.00),
                new Order("Smartphone", 2, 800.00),
                new Order("Tablet", 3, 300.00),
                new Order("Headphones", 4, 100.00)
        );
        Double reduce = orders.stream()
                .map(order -> order.getQuantity() * order.getPrice())
                .reduce(0.0, Double::sum);
        System.out.println(reduce);


//        Use Case: Employee Data Processing
//        Scenario: You have a list of employees,
//        each with a name, department, years of experience,
//        and salary. You want to:
//
//        Transform the employee data to get
//        each employee's annual salary (using map()).
//        Calculate the total salary paid to all employees using reduce().

        // List of employees
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Engineering", 5, 5000),
                new Employee("Alice", "Marketing", 8, 4500),
                new Employee("Bob", "Engineering", 3, 4000),
                new Employee("Diana", "HR", 10, 3500)
        );
        // Step 1: Map each employee to their annual salary
        // Step 2: Reduce to get the total salary paid to all employees
        Double reduce1 = employees.stream()
                .map(employee -> employee.getSalary() * 12)
                .reduce(0.0, (aDouble, aDouble2) -> aDouble + aDouble2);
        System.out.println(reduce1);


    }

    static class Order {
        String product;
        int quantity;
        double price;

        public Order(String product, int quantity, double price) {
            this.product = product;
            this.quantity = quantity;
            this.price = price;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }
    }

    static class Employee {
       String name;
       String department;
       int yearOfExperience;
       double salary;

        public Employee(String name, String department, int yearOfExperience, double salary) {
            this.name = name;
            this.department = department;
            this.yearOfExperience = yearOfExperience;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public int getYearOfExperience() {
            return yearOfExperience;
        }

        public double getSalary() {
            return salary;
        }
    }
}
