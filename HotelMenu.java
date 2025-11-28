/*
show menu


*/

import java.util.Scanner;
public class HotelMenu
{
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);
        String menu;
        menu = "";
        System.out.println("-----Menu-----\n"+
                            " -Momo - Rs.160 \n -Chowmein - Rs \n -Noodles \n -Mushroom Soup \n -Pizza \n - Burger");
        System.out.print("Press '1' for order and '2' for comfirmation.");
        int order = scanner.nextInt();
        while(order == 1){
            
        do{System.out.print("Enter Your Order: ");
        menu = scanner.nextLine();}while(menu.isEmpty());
        menu = menu.toLowerCase();
        switch(menu){
        case("momo") -> 
        {
            System.out.println("Your total is: ");
        }
                    }
         }
    }
}