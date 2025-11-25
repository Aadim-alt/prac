//A calculator program
//
//
import java.util.Scanner;
public class Calculator
{
    static double result;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first Number: ");
        double a = scanner.nextInt();
        
        System.out.println("Enter '+' For addition, '-' For division, '*' for Multiplication, '/' for Division, '^' for power and '&'for root.");
        char Case = scanner.next().charAt(0);
        
        System.out.print("Enter the second Number: ");
        double b = scanner.nextInt();
        
        boolean validOperation = true;
        
        
        switch(Case)
        {
            case '+' -> result = a+b;
            case '-' -> result = a-b;
            case '*' -> result = a*b;
            case '/' ->{
            if(b == 0){
            System.out.println("Cannot divide by zero");
            validOperation = false;
            }
            else{
            result = a/b;
            }
            }
            case '^' -> result = Math.pow(a,b);
            default -> {
            System.out.println("Enter a valid operator.");
            validOperation = false;
            }
        }
        if(validOperation){
        System.out.println(result);}
        
        
        scanner.close();
    }
}