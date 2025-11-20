
/*
 * Create a Java program called MegaStore that does the following:

1. Ask the user for:

Customer name

Product name

Product price

Quantity

Calculate the total bill (price × quantity).

2. Apply a discount using nested if:

If total bill is:

>= 5000 → 20% discount

>= 3000 → 15% discount

>= 1000 → 10% discount

Else no discount

Use nested if to apply this.

3. Lucky Draw System (use Random)

Generate a random number between 1 and 5.

If the number is:

1 → Give additional ₹200 off

2 → Give additional ₹100 off

3 → No extra discount

4 → Multiply discount by 2 using Math

5 → Add a surprise discount: 5% of the price using Math

4. Final Output Print:

Customer name

Product name

Original amount

Discount applied

Lucky draw result

Final amount to pay
 */
import java.util.Scanner;
import java.util.Random;
public class AbigProject
{
    public static void main(String[] args){
        
    
    Scanner scanner = new Scanner(System.in);
    
    Random random = new Random();
    
    int luckyNum = random.nextInt(1,6);
    
    System.out.print("Enter Your Name: ");
    String custName = scanner.nextLine();
    
    System.out.print("\n Enter Product Name: ");
    String proName = scanner.nextLine();
    
    System.out.print("\n Enter Product Price: Rs.");
    double price = scanner.nextDouble();
    
    
    System.out.print("\n Enter Quantity: ");
    double quantity = scanner.nextDouble();
    
    double total = price*quantity;
    
    System.out.printf("\n Your lucky number is: %d \n",luckyNum);
    
    //System.out.println(total); test print
    
    if(total>=5000)
    {
         price = total - (20/100.0)*total;
        if(luckyNum == 1)
        {
            price = total - 200;
            System.out.printf("Congrats You got extra 200rs off. Your price is: Rs.%.2f \n",price);
            //System.out.println("Customer Name: "+ custName+ "Product Name: "+proName);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs %.2f \n Discount applied: 20%% \n Lucky Number= %d \n Final Amount = Rs %.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==2)
        {
            price = total - 100;
            System.out.printf("Congrats you got extra 100rs off. Your price is: Rs.%.2f \n",price);
            //System.out.println("Customer Name: "+ custName+ "Product Name: "+proName);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 20%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==3)
        {
            System.out.printf("Sadly You got no Extra Discount. Your price is: Rs.%.2f \n",price);
            //System.out.println("Customer Name: "+ custName+ "Product Name: "+proName);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 20%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==4)
        {
            price = total + (20/100.0)*total;
            price = total - (40/100.0)*total;
            System.out.printf("Congrats your Discount Doubled. Your price is: Rs.%.2f \n",price);
            //System.out.println("Customer Name: "+ custName+ "Product Name: "+proName);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs%.2f \n Discount applied: 20%% \n Lucky Number= %d \n Final Amount = Rs%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==5)
        {
            price = total - (5/100.0)*total;
            System.out.printf("Congrats you got extra 5% off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 20%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        
    }
    else if(total>=3000)
    {
         price = total - (15/100.0)*total;
        if(luckyNum == 1)
        {
            price = total - 200;
            System.out.printf("Congrats You got extra 200rs off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 15%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==2)
        {
            price = total - 100;
            System.out.printf("Congrats you got extra 100rs off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 15%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==3)
        {
            System.out.printf("Sadly You got no Extra Discount. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 15%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==4)
        {
            price = total + (15/100.0)*total;
            price = total - (30/100.0)*total;
            System.out.printf("Congrats your Discount Doubled. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 15%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==5)
        {
            price = total - (5/100.0)*total;
            System.out.printf("Congrats you got extra 5% off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 15%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        
    }
    else if(total>=1000)
    {
         price = total - (10/100.0)*total;
        if(luckyNum == 1)
        {
            price = total - 200;
            System.out.printf("Congrats You got extra 200rs off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 10%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==2)
        {
            price = total - 100;
            System.out.printf("Congrats you got extra 100rs off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 10%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==3)
        {
            System.out.printf("Sadly You got no Extra Discount. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 10%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==4)
        {
            price = total + (10/100.0)*total;
            price = total - (20/100.0)*total;
            System.out.printf("Congrats your Discount Doubled. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 10%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==5)
        {
            price = total - (5/100.0)*total;
            System.out.printf("Congrats you got extra 5% off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 10%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        
    }
    else
    {
       price = total;
        if(luckyNum == 1)
        {
            price = total - 200;
            System.out.printf("Congrats You got extra 200rs off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 0%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==2)
        {
            price = total - 100;
            System.out.printf("Congrats you got extra 100rs off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 0% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==3)
        {
            System.out.printf("Sadly You got no Extra Discount. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 0%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==4)
        {
            
            System.out.printf("Congrats your Discount Doubled But you had no discount. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 0%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        }
        else if(luckyNum==5)
        {
            price = total - (5/100.0)*total;
            System.out.printf("Congrats you got extra 5% off. Your price is: Rs.%.2f \n",price);
            System.out.printf("Customer Name: %s \n Product Name: %s \n Product Price: Rs.%.2f \n Discount applied: 0%% \n Lucky Number= %d \n Final Amount = Rs.%.2f",custName,proName,total,luckyNum,price);
        } 
    }
    scanner.close();
    
    }
}