//compound interest calculator
import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String[] args)
    {
        double a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principle amount: ");
        double p = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double r = scanner.nextDouble();
        double ra = r/100;
        System.out.print("Enter the Time (in years): ");
        double t = scanner.nextDouble();
        System.out.print("Enter the Number of times interest is Compounded: ");
        double n = scanner.nextDouble();
        double pow = n*t;
        a = p * Math.pow((1+ra/n),pow);
        System.out.printf("Your Final Amount is: $%,.2f \n after %.1f",a,t );
        scanner.close();
    }
}