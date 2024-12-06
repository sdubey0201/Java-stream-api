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
}
