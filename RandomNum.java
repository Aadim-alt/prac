import java.util.Random;
public class RandomNum
{
    public static void main(String[] args)
    {
        Random random = new Random();
        //int number;
        //number = random.nextInt();
        //System.out.println(number);
        //this creates a random number a huge random number from -2billion to +2billion for small number do this
        //int rannum;
        //rannum = random.nextInt(1,6);//this gives random number between 1 and n-1 that is 6-1=5 that is 1 and 5
        //System.out.println(rannum);//this gives 1 number if i want three or many different numbers i will do
        int num1, num2, num3;
        num1 = random.nextInt(1,6);
        num2 = random.nextInt(1,6);
        num3 = random.nextInt(1,6);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        //not only whole number if i do double num1 instead of int it will give integer
        double num4;
        num4 = random.nextDouble(); //(this creates random number between 0 and 1)
        System.out.println(num4);
        //not only int and double it can be used in boolean as well.
        boolean isHeads= random.nextBoolean();
        //System.out.println(isHeads);
        if (isHeads){
        System.out.println("Heads");}
        else{
        System.out.println("Tails");}
    }
}