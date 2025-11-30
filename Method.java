import java.util.Scanner;

//method is a block of reusable code also called custom function.
// only public method is used and when called on public method the custom function or method block is used or its unused. 
public class Method
{
    public static void main(String[] args)
    {
        //happyBirthday(); //the variable in this method won't be on the happyBirthday method so we have to passs it via Argument that is
        //String name = "Aadim";
        //int age = 18;
        //happyBirthday(name); //after having int age in the down method its compulsion to add int variable while calling it or it shows error
       // happyBirthday(name, age);
       //double result = value(2);
       //System.out.println(result); //isn't this cool a whole fucking method just for one block of code this is freaking cool. the method value is now used only for square.
        System.out.println(value(2)); //we can also do this
        System.out.println(cube(4));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Fist Name: ");
        String first = scanner.nextLine();
        System.out.println("Enter Your last name: ");
        String last = scanner.nextLine();
        System.out.println(greeting(first, last));
    }
    //void happyBirthday //well this is a method but it can't be called on main method because main method is static.
    //static void happyBirthday() //this doesn't pass the argument. to pass the argument we have to declared the variable type which is called paramenter
    //static void happyBirthday(String name) // its not required for the name that is variable to be same name in this case name but is preferred to avoid confusion.
    static void happyBirthday(String name, int age)
    {
        System.out.println("Happy Birthday to you");
        System.out.println("Happy Birthday to you");
        System.out.println("Happy Birthday Happy Birthday");
        System.out.printf("Happy Birthday to you %s\n",name);
    }
    
    //method can also return value
    // void value // this can't be used because void is used when we are not returning anything
    static double value(double number) { //this is used since we are returning lets say a double value.
        return number*number; //returning square
    }
    //lets do a method for cube
    static double cube(double num) //static is not necessary but here we are giving the value to a static method that is main we have to write static
    {
        return num*num*num;
    }
    //lets do method for greeting user
    static String greeting(String first, String last)
    {
        return "Hello"+ first + " "+ last;
    }
}