import java.util.Scanner;

public class QUESTION3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]numbers = new int[10];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
