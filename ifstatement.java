//if statement
import java.util.Scanner;
public class ifstatement
{
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are an adult. You can Drink.");
        }
        else if(age<=0){
            System.out.println("PLz Enter a Valid age");
        }
        else{
            System.out.println("Suck on nipples kidddo");
        }
    }
}