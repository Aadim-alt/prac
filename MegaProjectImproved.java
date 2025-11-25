import java.util.Scanner;
import java.util.Random;

public class MegaProjectImproved
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        userName = "";
        password = "";
        double total;
        double finalPrice = 0;
        double discountPrice = 0;
        Random random = new Random();
        int luckyNum = random.nextInt(1,5);
        double priceAfter = 0;
        do{
            System.out.print("Enter UserName: ");
            userName = scanner.nextLine();
        }while (userName.isEmpty() || userName.length()<3);
        do{
            System.out.print("Enter Password: ");
            password = scanner.nextLine();
        }while (password.isEmpty() || password.length()>12 || password.length()<3);
            System.out.println("SignUp Succesfull!");
        
            int option;
        
        do{
            System.out.println("\n1. Buy a Product.");
            System.out.println("2. View Cart Total.");
            System.out.println("3. Apply Discount.");
            System.out.println("4. Lucky Draw.");
            System.out.println("5. Exit.");
            option = scanner.nextInt();
            
            switch(option){
            
            case (1) -> {
                String product = "";
                scanner.nextLine();
                do{System.out.print("Enter Product Name: ");
                product = scanner.nextLine();
            }while (product.isEmpty());
            
                System.out.print("Enter Product price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter Product Quantity: ");
                int quantity = scanner.nextInt();
                total = price * quantity;
                finalPrice = finalPrice + total;
                
            }
            case (2) -> {
                System.out.print("Total is: \n\n\n"+ finalPrice);
                
            }
            case (3) -> {
                System.out.println("====Discount====");
                System.out.println("Total price: "+ finalPrice);
                if(finalPrice>10000)
                {
                    discountPrice = finalPrice - (25.0/100.0)*finalPrice;
                    System.out.println("You got 25% Discount.Your price after discount is: "+ discountPrice);
                }
                else if(finalPrice>5000)
                {
                    discountPrice = finalPrice - (20.0/100.0)*finalPrice;
                    System.out.println("You got 20% Discount.Your price after discount is: "+ discountPrice);
                }
                else if(finalPrice > 3000)
                {
                    discountPrice = finalPrice - (15.0/100.0)*finalPrice;
                    System.out.println("You got 15% Discount.Your price after discount is: "+ discountPrice);
                }
                else if(finalPrice>1000)
                {
                    discountPrice = finalPrice - (10.0/100.0)*finalPrice;
                    System.out.println("You got 10% Discount.Your price after discount is: "+ discountPrice);
                }
                else{
                    discountPrice = finalPrice;
                    System.out.println("You got 0% Discount.Your price after 0 discount is Same. That is: "+ discountPrice);
                }
            }
            case(4) ->
            {
                 if(luckyNum == 1)
                 {
                    priceAfter = discountPrice - 200;
                    System.out.println("Your Price is After lucky Discount is: "+ priceAfter);
                    }
                
                else if(luckyNum == 2)
                {
                    priceAfter = discountPrice - 100;
                    System.out.println("Your Price is After lucky Discount is: "+ priceAfter);
                    }
                else if(luckyNum == 3)
                {
                    priceAfter = discountPrice;
                    System.out.println("Your Price is After lucky Discount is: "+ priceAfter);
                    }
                   
                else if(luckyNum == 4)
                {
                    priceAfter = discountPrice - (5/100)*discountPrice;
                    System.out.println("Your Price is After lucky Discount is"+ priceAfter);
                    }
            }
            
            
            }
            
            
        }while(option != 5);
        System.out.printf("Username = %s \n Final Price = %.2f",userName,priceAfter);
    }
}
