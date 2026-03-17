package Ex02;

import Ex01.Order;
import Ex01.OrderItem;

public class OrderCalculator {
   private DiscountStrategy discountStrategy;

    public OrderCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculate(double totalAmount) {
        return discountStrategy.applyDiscount(totalAmount);
    }
}
