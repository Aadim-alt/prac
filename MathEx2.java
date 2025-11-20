//circumference area and volume of a circle.
import java.util.Scanner;
public class MathEx2
{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius of a circle: ");
    double radius = scanner.nextInt();
    double cir, area, volume;
    cir = 2* Math.PI*radius;
    area= Math.PI*Math.pow(radius,2);
    volume = (4/3)*Math.PI*Math.pow(radius,3);
    System.out.println("The Circumference is: "+cir+"cm. The area is: "+area+"cm square. The Volume is: "+volume+"cm cube.");
    System.out.printf("The Volume is %.1fcm cube.",volume);//%f is for float string and int same as c and %.1f shows how many decimals in the number
    // same with string %s and with int %d. printf("Hello my name is %s i am %d years old and my gpa is %f",name,age,gpa);
    scanner.close();
    }
}