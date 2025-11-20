//printf
import java.util.Scanner;
public class PrintF
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();
        System.out.printf("Hello %s. You are %d years old. \n",name,age);
        double gpa = 3.67;
        System.out.printf("I got %f gpa \n",gpa); //%f used for double or float
        System.out.printf("I got %.2f gpa \n",gpa); // %.2 meaning 2 decimal after number
        System.out.printf("I got %+.2f gpa \n",gpa); // +.2 meaning + sign before the number and nuumber should be +ve not -ve
        double price = 99999.99;
        System.out.printf("The price is %,.2f",price); // , meaning , at thousand places example 99,999.99
        double price2= -54.6;
        System.out.printf("That price %(.1f is in negative",price2); // ( puts the negative number in parenthesis -(54.6)
        // % f the space in midlle is used for aligning it gives space to positive number but not to -ve.
        //example
        // 10
        // 20
        //-30
        int id1,id2,id3;
        id1=1;
        id2=24;
        id3=456;
        System.out.printf("%03d\n",id1);
        System.out.printf("%03d\n",id2);
        System.out.printf("%03d\n",id3); //this paddes the number meaning adds 0. like since the long number is 3 digit long
        //it adds 0 infront of short number making it 3 digit long for 1 its 001 for 24 its 024 etc this is also used for aligning
        //if no 0 that is %3 only not 0 then it will be    1 like 2 space and the number it aligns short number with long one.
        //or if you use -4 -3 instead of 3 like %-3 then instead of left padding it will have empty space on right. it doesn't look align
        //but it will have space on right instead.
    }
}