import java.util.Scanner;

public class QUESTION6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter category (1-Electronics, 2-Clothing, 3-Grocery): ");
        int category = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Discount eligible? (yes/no): ");
        String discountInput = sc.nextLine();

        boolean discount = discountInput.equalsIgnoreCase("yes");

        double price = 0;

        if (category == 1)
            price = 10000;
        else if (category == 2)
            price = 5000;
        else if (category == 3)
            price = 2000;
        else {
            System.out.println("Invalid category");
            return;
        }

        if (discount)
            price = price - price * 0.10;

        System.out.println("Final price: ₹" + price);
    }
}
