package wish.list;

import java.util.Scanner;

public class WishlistInitial extends WishlistMain {
    public static String item_name; //public variable for what the user wants
    public static double money_bank; //public variable for how much money the user has
    public static double item_cost; //public variable for how much the item costs

    public WishlistInitial() {
        super();
    }

    public void Welcome() {

        //public method for a greeting to the program

        System.out.println("Welcome to Wishlist!");
        System.out.println();

    }

    public String ItemName(Scanner input) {

        //public method to store what the user wants to get

        String itemName;

        System.out.println("What is it you are saving for? ");
        itemName=input.nextLine();

        item_name=itemName;

        return itemName;
    }

    public double ItemCost(Scanner input) {

        //public method to store how much the item is

        double itemCost;
        String itemName=item_name;

        System.out.println("How much is " + itemName + "?");
        itemCost=input.nextDouble();

        item_cost=itemCost;

        return itemCost;
    }

    public double MoneyBank(Scanner input) {

        //public method to store how much money the user has saved

        double moneyBank;

        System.out.println("Enter the amount of money you have saved: ");
        moneyBank=input.nextDouble();

        money_bank=moneyBank;

        return moneyBank;
    }

}
