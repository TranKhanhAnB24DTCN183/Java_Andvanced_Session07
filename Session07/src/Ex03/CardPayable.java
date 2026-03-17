package Ex03;

public interface CardPayable extends PaymentMethod{
    void processCardPayment(double amount);
}
