package Ex04;

class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;
    }
}