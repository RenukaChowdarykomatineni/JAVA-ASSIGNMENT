import java.util.Scanner;
public class QUESTION1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double celsius = sc.nextDouble();
         double fahrenheit = (celsius *9/5)+32;
         double kelvin = celsius +273.15;
         System.out.println("Temperature in fahrenheit: "+ fahrenheit);
         System.out.println("Temperature in kelvin:" + kelvin);

    }
}