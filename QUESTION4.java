import java.util.Scanner;

public class QUESTION4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        // Input matrix
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Row sums
        System.out.println("\nSum of each row:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Column sums
        System.out.println("\nSum of each column:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}

