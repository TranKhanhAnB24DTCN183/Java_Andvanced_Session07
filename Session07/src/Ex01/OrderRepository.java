package Ex01;

public class OrderRepository {
    public void save(Order order) {
        System.out.println("Saving order: " + order.orderId);
    }
}
