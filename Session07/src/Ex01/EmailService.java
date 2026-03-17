package Ex01;

public class EmailService {
    public void sendEmail(Customer customer, Order order) {
        System.out.println("Đã gửi email đến " + customer.email + ": Đơn hàng " + order.orderId + " đã được tạo");    }
}
