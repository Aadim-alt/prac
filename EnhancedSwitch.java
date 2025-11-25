//Enhanced Switch and a replacement for many else if statements
import java.util.Scanner;
public class EnhancedSwitch
{
    public static void main(String[] args) 
    {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Marks You got");
        int marks = scanner.nextInt();
        switch(marks)
        {
            case(marks>=70) -> System.out.println("You got an A");
            
        }*/ //looks like switch does not work with boolean case that is condition
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The day: ");
        String day = scanner.nextLine().toLowerCase();
        /*switch(day)
        {
            case("sunday") -> System.out.println("Today is Weekend.");
            case("monday") -> System.out.println("Today is Weekday.");
            case("tuesday") -> System.out.println("Today is Weekday.");
            case("wednesday") -> System.out.println("Today is Weekday.");
            case("thursday") -> System.out.println("Today is Weekday.");
            case("friday") -> System.out.println("Today is Weekday.");
            case("saturday") -> System.out.println("Today is Weekend.");
            default -> System.out.println("It is not a Day.");
        }*/
        //we can also do this
        switch(day)
        {
            case("sunday"), ("saturday") ->
            System.out.println("Today is Weekend.");
            case("monday"), ("tuesday"), ("wednesday"), ("thursday"), ("friday")  -> 
            System.out.println("Today is Weekday.");
            default -> System.out.println("It is not a Day.");
        }
        
        scanner.close();

        
    }
}