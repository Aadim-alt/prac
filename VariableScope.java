//variable scope = where variable can be accesed.
public class VariableScope
{
    static int x = 4; //Class
    public static void main()
    {
        int x = 1; //Local 
        System.out.println(x);
        vaRiable();
        doSth();
    }
    static void vaRiable()
    {
        int x = 2; //Local
        System.out.println(x);
    }
    static void doSth()
    {
        System.out.println(x); //this prints the Class Scope but if local variable was also defined here it will be prioritized;
    }
}
//Local variable of one method does not exist in another but Class exist unless there is no local variable in that method just like in method doSth();
//Class variables are used for constants whose value does not change in any method.