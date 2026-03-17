package Ex02;

public class Main {
    public static void main(String[] args) {
        double total = 1000000;
        System.out.println("Đơn hàng: tổng tiền 1.000.000, áp dụng PercentageDiscount 10%");
        OrderCalculator order1 =
                new OrderCalculator(new PercentageDiscount(10));

        System.out.println("Số tiền sau giảm: " + (int)order1.calculate(total));
        System.out.println("\nĐơn hàng: tổng tiền 1.000.000, áp dụng FixedDiscount 50.000");

        OrderCalculator order2 =
                new OrderCalculator(new FixedDiscount(50000));

        System.out.println("Số tiền sau giảm: " + (int)order2.calculate(total));
        System.out.println("\nĐơn hàng: tổng tiền 1.000.000, áp dụng NoDiscount");

        OrderCalculator order3 =
                new OrderCalculator(new NoDiscount());
        System.out.println("Số tiền sau giảm: " + (int)order3.calculate(total));


        System.out.println("\nThêm HolidayDiscount 15% (không sửa code cũ)");
        OrderCalculator order4 =
                new OrderCalculator(new HolidayDiscount());

        System.out.println("Số tiền sau giảm: " + (int)order4.calculate(total));

    }
}