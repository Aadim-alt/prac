// to get user name from email and domain and to check if its valid
import java.util.Scanner;
public class EmailChecker
{   String email;// instance variable // static String email; static variable
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        EmailChecker v1 = new EmailChecker(); // this is only written in instance variable declaration
        // v1 is a variable can be anything new v2 or anything you want
        System.out.print("Enter your email: ");
        v1.email = scanner.nextLine();  //static and local variable just email = scanner.nextLine();
        
        String usName, domain;
        
        if(v1.email.contains("@"))
        {
            
            usName = v1.email.substring(0,v1.email.indexOf("@")); //static ra local variable ma v1. natak garnu pardaina they are best
            domain = v1.email.substring(v1.email.indexOf("@") +1);
            System.out.printf("Hello %s",usName);
            System.out.printf("\n Your Domain is: %s",domain);
        }
        else
        {
            System.out.println("Enter a valid email");
        }
        
        
        
        
        
        
        scanner.close();
    }
}