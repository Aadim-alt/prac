import java.util.Scanner;
public class NestedLoopPrac
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int maxC = scanner.nextInt();
        System.out.print("Enter the Number of Column: ");
        int maxR = scanner.nextInt();
        System.out.print("Enter the Character you want the Matrix of: ");
        char isChar = scanner.next().charAt(0);
        for(int i = 1; i<=maxC; i++)
        {
            for(int j = 1; j<=maxR; j++)
            {
                System.out.print(isChar);
            }
            System.out.println();
        }
    }
}