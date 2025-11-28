
public class BreakContinue
{
    public static void main(String[] args)
    {
        for(int i = 1; i <=10; i++)
        {
            /*if(i == 5)
            {
                break; //ends the loop when i = 5;
            }*/
            if(i == 5)
            {
                continue; //skips the loop from 5 to 6 no i = 5; its skipped.
            }
            System.out.println(i);
        }   
    }
}