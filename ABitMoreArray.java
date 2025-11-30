
//Search for an array
import java.util.Scanner;
public class ABitMoreArray
{
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        boolean isTrue = false;
        System.out.println("Enter the number of food you like: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        String foods[] = new String[num];
        for (int i =0; i<num; i++)
        {
            System.out.print("Enter the food You like: ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("What food are you Searching: ");
        String target = scanner.nextLine();
        
        for(int i =0; i<num; i++)
        {
            if (foods[i].equals(target))
            {
                System.out.println("You food lies on index: "+i);
                isTrue = true;
                break;
            }
        }
        if(!isTrue)
        {
            System.out.println("The Food You are searching for is not listed in this array");
        }
    }
}