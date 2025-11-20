//shopping cart
import java.util.Scanner;
public class cart
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What would you like to buy?: ");
        String nameItem = scanner.nextLine();
        System.out.print("How many would you like to buy?: ");
        int quantity = scanner.nextInt();
        System.out.print("What's The Price?: $");
        double Price = scanner.nextDouble();
        double total = quantity*Price;
        System.out.print("Your total of "+ nameItem+" is $"+total);
        scanner.close();
    }
}