import java.util.Scanner;
import java.util.Random;
public class NumberGuess
{
    public static void main(String[] args)
    {
        int num = 0;
        Random random = new Random();
        num = random.nextInt(1,101);
        Scanner scanner = new Scanner(System.in);
        int guessNum = 0;
        System.out.println("Guess a Number from 1 to 100: ");
        guessNum = scanner.nextInt();
        int n = 0;
        while (guessNum != num)
        {
            n++;   
            if(guessNum>num && guessNum <= 100)
            {
                System.out.println("The Number is less than "+ guessNum);
                System.out.print("Guess the number again: ");
                guessNum = scanner.nextInt();
            }
            else if(guessNum<num && guessNum > 0)
            {
                System.out.println("The Number is Greater than "+ guessNum);
                System.out.print("Guess the number again: ");
                guessNum = scanner.nextInt();
            }
            else
            {
                System.out.print("Enter a valid Number (1 to 100): ");
                guessNum = scanner.nextInt();
            }
        }
        System.out.println("Congrats "+ num+ " is the correct Number. You took "+n+" number of tries.");
    }
}