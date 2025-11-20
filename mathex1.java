import java.util.Scanner;
public class mathex1
{
    public static void main(String[] args){
    //Hypotenuse of a triangle h2 = root under b2 + c2
    double hypotenuse, b, p;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Size of base: ");
    b = scanner.nextDouble();
    System.out.print("Enter the size of Hypotenuse");
    p = scanner.nextDouble();
    hypotenuse = Math.sqrt(Math.pow(b,2)+ Math.pow(p,2));
    System.out.println("The Hypotenuse is: "+ hypotenuse + "cm");
    }
}