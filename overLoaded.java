//method overloaded. (Meaning same name for method but different parameters) MEthods can share same name must have different parameters. Must have different signature
//Signature means name + different parameters.
public class overLoaded
{
    public static void main(String args[])
    {
        double sum = add(1 ,2); // This uses first add method with two parameters;
        System.out.println(sum);
        sum = add(1, 3, 4); //this uses second method with 3 parameters
        System.out.println(sum);
    }
    static double add(int a, int b)
    {
        return a+b;
    }
    /*static double add(double a, double b)
    {
        return a+b;
    }*/ //this will be error because same method same parameter its error
    static double add(double a, double b, double c) //this works because this method will only be used when three variables are given
    {
        return a+b+c;
    }
}