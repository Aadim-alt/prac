import java.util.Scanner;
public class WtConversion
{
    public static void main(String[] args)
    {
        //weight conversion program.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello User. This is a weight conversion Program");
        System.out.print("Press 1 for kg to lbs conversion and 2 for pound to kg conversion: ");
        int choice = scanner.nextInt();
        double wt;
        
        if(choice == 1)
        {
            System.out.print("Enter Your Weight in Kg: ");
            wt = scanner.nextDouble();
            wt = wt * 2.204623;
            System.out.printf("You weight %.3f lbs \n",wt);
        }
        else if(choice == 2)
        {
            System.out.print("Enter Your Weight in lbs: ");
            wt = scanner.nextDouble();
            wt = wt / 2.204623;
            System.out.printf("You weight %.3f kg \n",wt);
        }
        else
        {
            System.out.println("Enter a valid choice");
        }
        scanner.close();
    }
}