
/**
 * Write a description of class NesteLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NesteLoop
{
    public static void main(String[] args)
    {
        for(int i = 1; i<=3; i++)
        {
            for(int j = 1; j<=10; j++)
            {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}