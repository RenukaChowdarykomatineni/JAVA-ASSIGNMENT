import java.util.Scanner;

public class QUESTION1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable declarations
        String name;
        int age;
        char grade;
        String favSubject;

        // Input
        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter student age: ");
        age = sc.nextInt();

        System.out.print("Enter student grade: ");
        grade = sc.next().charAt(0);

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter favorite subject: ");
        favSubject = sc.nextLine();

        // Output
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Favorite Subject: " + favSubject);
    }
}
