import java.util.Arrays;//import class Arrays very useful when using array
import java.util.Scanner;

public class Array
{
    public static void main()
    {
        
        String[] fruits = {"Apple","Mango","Banana"};
        System.out.println(fruits); //Prints memory address
        System.out.println(fruits[0]);//First memory addres value is printed in this case Apple.
        fruits[0] = "Pineapple";//Value of Apple is changed to Pineapple.
        System.out.println(fruits[0]);//Updated first value in this case Pineapple is printed
        // int numOfFruits = fruits.lenght(); //The parenthesis is not used because this is not a method.
        //Array length -> Variable
        //String  length()-> Method
        //Array size()-> Method
        //Collections size()->Method
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        //To get all the values of array we use for loop
        for(int i=0; i<numOfFruits; i++)
        {
            System.out.println(fruits[i]);
        }
        //Enhanced for loop
        for(String fruit: fruits)
        {
            System.out.println(fruit);
        }//// Enhanced for loop: goes through each item in the array one by one (like Python's "for x in list") for every item in fruits the fruit variable goes one by one.
        
        Arrays.sort(fruits); //This sort the values of array. In this case alphabetically in numerical case Ascending like that.
        System.out.println(fruits);
        
        Arrays.fill(fruits, "Papaya"); //This fills the array with another value. Like the array had mango apple and other right all that value replaced by this value.
        for(String fruit: fruits) //The variable fruit here is a temporary variable just for this loop. It doesn't have relation with same variable outside the loop
        {
            System.out.println(fruit);
        }
        //You can also fill from one value to another like this// Arrays.fill(variableName, start index, end index, value to replace) The start index and end index are the position of the values
        int[] nums = {1,2,3,4,5,6,7};
        for(int num: nums)
        {
            System.out.println(num);
        }
        Arrays.fill(nums, 1,5,0); //This does 1 0 0 0 0 6 7 (So first value is 0 and last is n-1)
        for(int num: nums)
        {
            System.out.println(num);
        }
        
        //While defining array its always should be defined by length. As shown above an array can't be filled again after assigning the value more than that can hold. For giving array length we have to do this
        String[] names = new String[3]; //The 3 is the array length
        //So to ask the user how many name or any value the user want we have to
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of values you want: ");
        int values = scanner.nextInt();
        String[] newNames = new String[values]; //Like this
        
        
    }
}
// ---------------------------
// IMPORTANT METHODS FROM Arrays CLASS
// ---------------------------

// 1️⃣ Arrays.sort(array)
// Sorts an array in ascending order
// Example:
// int[] numbers = {5,2,9,1};
// Arrays.sort(numbers);
// System.out.println(Arrays.toString(numbers)); // [1, 2, 5, 9]

// 2️⃣ Arrays.fill(array, value)
// Fills the entire array with a single value
// Example:
// int[] arr = new int[5];
// Arrays.fill(arr, 7); // [7, 7, 7, 7, 7]

// 2️⃣b Arrays.fill(array, startIndex, endIndex, value)
// Fills part of the array (startIndex inclusive, endIndex exclusive)
// Example:
// int[] arr = {1,2,3,4,5};
// Arrays.fill(arr, 1, 4, 0); // [1, 0, 0, 0, 5]

// 3️⃣ Arrays.toString(array)
// Converts array into readable string for printing
// Example:
// int[] arr = {1,2,3};
// System.out.println(Arrays.toString(arr)); // [1, 2, 3]

// 4️⃣ Arrays.equals(array1, array2)
// Compares two arrays for equality (all elements must match)
// Example:
// int[] a = {1,2,3};
// int[] b = {1,2,3};
// System.out.println(Arrays.equals(a, b)); // true

// 5️⃣ Arrays.copyOf(array, newLength)
// Copies array or part of it
// Example:
// int[] a = {1,2,3,4};
// int[] b = Arrays.copyOf(a, 2); // [1, 2]

// ⚡ TIP: Combine Arrays methods with enhanced for loop for clean code
// Example:
// int[] arr = new int[5];
// Arrays.fill(arr, 9);
// for(int x : arr) {
//     System.out.println(x);
// }
