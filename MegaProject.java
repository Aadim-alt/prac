import java.util.Scanner;
import  java.util.Random;
public class MegaProject
{
    public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            String Username = "";
            String Password = "";
            double total = 0;

            while(Username.isEmpty() || Username.length()<3)
            {
                System.out.println("Enter Your Username (Username must be >3 characters): ");
                Username = scanner.nextLine();

            }
            while(Password.isEmpty() || Password.length()<6 || Password.length()>12)
            {
                System.out.println("Enter Your Password (Password must be >4 and <12 characters): ");
                Password = scanner.nextLine();
            }
            System.out.println("'Login Succesful' Welcome to the mall Mr/Ms/Mrs "+Username+ "(Press Enter to Continue)");
            scanner.nextLine();

            int a;
            System.out.print("Press 0 to start.");
            a = scanner.nextInt();
             
            
            
                System.out.print("1. Buy a Product\n" +
                        "2. View Cart Total\n" +
                        "3. Apply Discount\n" +
                        "4. Lucky Draw\n" +
                        "5. Exit Program");
                a = scanner.nextInt();
            
            while(a == 1){
                String product;
                scanner.nextLine();

                do{
                    System.out.print("Enter a Product Name: ");
                    product = scanner.nextLine();

                }while (product.isEmpty());




                double price;
                price = 0;
                while (price == 0) {
                    System.out.print("Enter the Product Price: ");
                    price = scanner.nextDouble();
                }


                int quantity;
                quantity = 0;
                while(quantity ==0){
                    System.out.print("Enter Product Quantity: ");
                    quantity = scanner.nextInt();
                }
                price = price * quantity;
                total = total + price;

                System.out.print("1. Buy a Product\n" +
                        "2. View Cart Total\n" +
                        "3. Apply Discount\n" +
                        "4. Lucky Draw\n" +
                        "5. Exit Program");
                a = scanner.nextInt();

            }
            while (a == 2){
                System.out.println("Your Total is "+ total);

                System.out.print("1. Buy a Product\n" +
                        "2. View Cart Total\n" +
                        "3. Apply Discount\n" +
                        "4. Lucky Draw\n" +
                        "5. Exit Program");
                a = scanner.nextInt();
            }
            while (a == 3){
                if(total >= 10000)
                {
                    total = total - (25.0/100)*total;
                    System.out.println("Your Price after discount is "+ total);
                }
                else if (total>=5000) {
                    total = total - (20.0/100)*total;
                    System.out.println("Your Price after discount is "+ total);
                }
                else if (total >= 3000) {
                    total = total - (15.0/100)*total;
                    System.out.println("Your Price after discount is "+ total);

                }
                else if (total >= 1000) {
                    total = total - (10.0/100)*total;
                    System.out.println("Your Price after discount is "+ total);

                }
                System.out.print("1. Buy a Product\n" +
                        "2. View Cart Total\n" +
                        "3. Apply Discount\n" +
                        "4. Lucky Draw\n" +
                        "5. Exit Program");
                a = scanner.nextInt();
            }
            Random random = new Random();

            while (a==4)
            {
                int luckyNum = random.nextInt(1,5);
                if(luckyNum == 1)
                {
                    total = total - 200;
                    System.out.print("Your Total is "+ total);
                }
                else if(luckyNum == 2)
                {
                    total = total - 100;
                    System.out.print("Your Total is "+ total);
                }
                else if(luckyNum == 3)
                {
                    System.out.print("Your Total is "+ total);
                }
                else if(luckyNum == 4)
                {
                    total = total - (5.0/100)*total;
                    System.out.print("Your Total is "+ total);
                }
                System.out.printf("Username = %s \n Final Price = %.2f",Username,total);
                System.out.print("1. Buy a Product\n" +
                        "2. View Cart Total\n" +
                        "3. Apply Discount\n" +
                        "4. Lucky Draw\n" +
                        "5. Exit Program");
                a = scanner.nextInt();
            
            }


        }
}
