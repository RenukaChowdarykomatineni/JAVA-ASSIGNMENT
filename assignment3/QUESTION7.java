import java.util.Scanner;

public class QUESTION7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        int group = marks / 10;

        switch (group) {
            case 10:   // marks = 100
            case 9:    // marks = 90–99
                System.out.println("Grade A");
                break;

            case 8:    // marks = 80–89
                System.out.println("Grade B");
                break;

            case 7:    // marks = 70–79
                System.out.println("Grade C");
                break;

            case 6:    // marks = 60–69
                System.out.println("Grade D");
                break;

            default:   // marks below 60
                System.out.println("Grade F");
        }
    }
}
