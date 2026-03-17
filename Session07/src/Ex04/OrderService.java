package Ex04;

public class OrderService {
    private OrderRepository repository;
    private NotificationService notificationService;

    public OrderService(OrderRepository repository,
                        NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public void createOrder(Order order) {
        repository.save(order);
        notificationService.send(
                "Đơn hàng " + order.orderId + " đã được tạo",
                "customer"
        );
    }
}
