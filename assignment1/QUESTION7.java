import java.util.Scanner;
public class QUESTION7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci series:");
        for(int i =1;i<=n;i++){
            System.out.println(a +" ");
            int c =a + b;
            a =b;
            b=c;
        }
    }
    
}
