//learning string

public class StringPractice
{
    public static void main(String[] args)
    {
        String name = "Aadim Dhakal";
        int length = name.length(); //finds the length of the string
        char letter = name.charAt(0); //finds the charcter of the name at that specific length. starts at 0 thats is 0 = A
        int index = name.indexOf("D"); //finds out where the char starts at which length is the char located at or starts at
        int lastindex = name.lastIndexOf("a"); //this shows where chart ends at where the last char is for this a it is 10
        name = name.toUpperCase(); //uppercases the all characters
        name = name.toLowerCase();
        name = name.trim(); //this trims the front and back spaces. ex "     Aadim Dhakal    " to "Aadim Dhakal"
        name = name.replace("a","o"); //this replaces all the a with o now my name is oodim dhokol
        name.isEmpty(); //to check if the string is empty or not.
        name.contains(" "); //this checks if name contains spaces. or if "a" it checks if the string contains a the character within "this"
        //suppose in a password form you have to check the password is correct or not this is used
        String password;
        password = "My password"; //your actual password stored in a database
        password.equals("My password"); //its checked and if correct acces given used in if statement
        password.equalsIgnoreCase("My password"); // this is dangerous it ignores the case of the password my password is also correct now. usefull in checking names.

    }
}