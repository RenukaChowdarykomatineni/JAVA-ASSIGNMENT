import java.util.Scanner;

public class QUESTION4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter genre code (1-Action, 2-Comedy, 3-Drama, 4-Horror, 5-Romance): ");
        int code = sc.nextInt();

        String genre;

        switch (code) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Horror";
                break;
            case 5:
                genre = "Romance";
                break;
            default:
                genre = "Invalid genre code";
        }

        System.out.println("Genre: " + genre);
    }
}
