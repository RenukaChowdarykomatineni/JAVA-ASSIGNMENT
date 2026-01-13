import java.util.Scanner;

public class QUESTION5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a valid driving license? (yes/no): ");
        boolean hasLicense = sc.nextBoolean();

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You are eligible to drive.");
            } else {
                System.out.println("You are NOT eligible to drive (No license).");
            }
        } else {
            System.out.println("You are NOT eligible to drive (Underage).");
        }
    }
}
