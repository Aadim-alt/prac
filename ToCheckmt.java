//to check if asked input is empty or not
import java.util.Scanner;
public class ToCheckmt
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter a name: ");
        name = scanner.nextLine();
        if(name.isEmpty()){ //isEmpty() checks whether the string is empty or not.
            System.out.println("You didn't enter a name.");
        }
        else{
        System.out.println("Hello "+ name);
    }
    }
}