import java.util.Scanner;

public class QUESTION3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total order amount: ");
        double amount = sc.nextDouble();

        double shippingCost;

        if (amount >= 100) {
            shippingCost = 0;
        } else {
            if (amount >= 50) {
                shippingCost = 5;
            } else {
                shippingCost = 10;
            }
        }

        System.out.println("Shipping cost: $" + shippingCost);
    }
}
