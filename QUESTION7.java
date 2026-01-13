import java.util.Scanner;

public class QUESTION7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random = (int)(Math.random() * 100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = sc.nextInt();

            if (guess > random) {
                System.out.println("Too high, try again");
            } else if (guess < random) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }
    }
}
