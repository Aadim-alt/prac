/*
 * Write a program that asks the user for:

Name (String)

Age (int)

Day of the week (String) – e.g., "Monday", "Saturday", etc.

Your program should decide ticket price based on these rules:

Age rules:

Age < 5 → Free ticket

Age 5–17 → Child ticket

Age 18–64 → Adult ticket

Age 65+ → Senior ticket

Day rules (discounts):

On “Wednesday” → All tickets 50% off

On “Saturday” or “Sunday” → Adult ticket +$2 (premium weekend price)

Validation:

If name is empty → Print “Name cannot be empty”

If age < 0 → Print “Invalid age”

If day is not a valid day → Print “Invalid day”

Output:

Print a friendly message like:
"Hello [Name], your ticket price is $X for a [ticket type] ticket."
 */
import java.util.Scanner;
public class MovieTicket
{
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    double price, price1, price2, price3;
    price = 10;
    price1 = 10 - 20/10;
    price2 = 10 + 2;
    price3 = 10- 50/10;
    
    System.out.print("Enter Your Name: ");
    String name = scanner.nextLine();
    if(name.isEmpty()){
    System.out.println("Plz Enter a Valid Name!");}
    else{
    System.out.println("Hello "+ name+ ". Plz fill the remaining questions. ");}
    
    
    
    
    System.out.print("Enter Your age: ");
    int age = scanner.nextInt();
    
    scanner.nextLine();
    
    System.out.print("Enter The Day (Sunday, Monday...): ");
    String day = scanner.nextLine();
    
    if (age<5){
    System.out.println("The Ticket is Free!");}
    
    else if ((day.equals("Wednesday")) && (age >= 5 && age<=108)){
    System.out.print("Your ticket price is: $"+price3);}
    
    else if ((age>17 && age<65) && (day.equals("Sunday") || day.equals("Saturday"))){//day == "sunday" is wrong in java the string should be compared with this day.equals("sunday")
    System.out.println("Your Ticket price is: $"+price2);}
    
    else if (age>=5 && age<18){
    System.out.println("The Ticket Price is: $"+price1);}
    
    else if (age>=18 && age<=64){
    System.out.println("Your Ticket price is: $"+price);}
    
    else if(age>64 && age<108){
    System.out.println("Your Ticket price is: $"+ price1);}
    
    else {
    System.out.println("Enter a Valid age");}
    }
}