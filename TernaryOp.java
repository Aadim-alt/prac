import java.util.Scanner;
public class TernaryOp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = scanner.nextInt();
        String isPass = (marks>=35)? "You Passed!": "You Failed!";
        System.out.println(isPass);
        
    }
}