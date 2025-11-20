//mad libs game
import java.util.Scanner;
public class LoveStory
{
    public static void main(String[] args){
        System.out.println("This is a Love Story");
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String noun2;
        String verb1;
        String verb2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter another Adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter another Adjective: ");
        adjective3 = scanner.nextLine();
        System.out.print("Enter a Noun: (Girl name) ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another Noun: (Boy Name) ");
        noun2 = scanner.nextLine();
        System.out.print("Enter a Verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another Verb: ");
        verb2 = scanner.nextLine();
        System.out.print("I saw a girl. Her name was "+ noun1+".");
        System.out.print("\n She was the most "+ adjective1+ " girl i had ever seen.");
        System.out.print("\n The first time I saw her, She was "+ verb1+".");
        System.out.print("\n Oops Bad luck she had a boyfriend named "+ noun2+".");
        System.out.print("\n Anyway she was not fat neither she was too " + adjective2+".");
        System.out.print("\n Well had to move on. Maybe I will find a Someone "+ adjective3 +" than her. \n" + "Atleast I am"+ verb2);
        scanner.close();
        System.out.println("\nThe Real Story:");
        System.out.println("I saw a girl. Her name was Palpasa. She was the most beautiful girl I had ever seen. \n Yeah her name sounds bad but she was beautiful. The first time I saw her She was just sitting quietly.\n We had met when we were child but sad no memories. Oops I fell in love with her. \nBut she has a boyfriend now my bad. Anyway she is neither fat neither slim but I used to tease her by caling slim.\n I started calling her sis so I can hide this feeling but nope not working. Hope I will be with her.\n I don't want to find anyone else. ");
    }
}