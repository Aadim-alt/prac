//ask user to enter the values of array
import java.util.Scanner;
public class MoreArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many Names do you want to insert: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[num];
        
        for(int i = 0; i<num; i++)
        {
            System.out.print("Enter the name of the Student: ");
            names[i] = scanner.nextLine();
        }
        for(String name: names)
        {
            System.out.println(name);
        }
        
        scanner.close();
    }
}