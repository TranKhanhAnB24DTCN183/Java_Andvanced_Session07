package Ex04;

public interface CardPayable extends PaymentMethod {
    void processCardPayment(double amount);
}
