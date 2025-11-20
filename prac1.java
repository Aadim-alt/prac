import java.util.Scanner;
/**
 * Write a description of class prac1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class prac1
{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double width = 0;
    double height = 0;
    double area = 0;
    System.out.print("Enter The Width: ");
    width = scanner.nextDouble();
    System.out.print("Enter the Height: ");
    height = scanner.nextDouble();
    area = width* height;
    System.out.println("The Area is :" + area);
    scanner.close(); //this is for closing the scanner code
    }
}