
import java.util.Scanner;
import java.util.Random;
public class Discount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter The Product Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter The Price Of The Product: ");
        double price = scanner.nextDouble();
        
        int discount = random.nextInt(5,31);
        
        
        System.out.print("Congrajulations You have a chance to win a discount from 5 to 30%. That is if you guess correctly. \n");
        System.out.print("Your Discount between 5 to 30% is: (Your guess) ");
        int guess = scanner.nextInt();
        
        int difference = Math.abs(discount-guess);
        
        double finalprice = price - (discount/100.0) * price;
        
        double luckyprice = price - (discount/200.0)*price;
        
        if(discount == guess)
        {
            System.out.printf("Congrats You won the discount. You have to pay %.2f \n",finalprice);
        }
        
        else if(difference<=3)
        {
            System.out.printf("Well You are lucky. The actual discount was %d but since you were close you will get half the discount. Your price is %.2f. \n",discount,luckyprice);
        }
        
        else
        {
            System.out.printf("Neither You are correct Nor Close. The discount was %d. Better luck next time. Your Total is %.2f \n",discount,price);
        }
        
        scanner.close();
    
    }
}