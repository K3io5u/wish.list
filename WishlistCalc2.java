package wish.list;

import java.util.Scanner;

public class WishlistCalc2 extends WishlistMain {

    public WishlistCalc2() {
        super();
    }

    public void Calc2() {
        double income, weeksTill, moneyNeed, moneyBank, itemCost;
        String payRate, itemName, choice;

        Scanner in = new Scanner(System.in);

        System.out.println("Hello and welcome to the Wishlist Access Calculator where you can calculate how long it will take you to get items from your Database file!");
        System.out.println();

        System.out.println("First off we have to find out how much money you have for the item you want. So we shall start there.");
        System.out.println();

        WishlistBank call = new WishlistBank();
        call.MoneyBank(in);

        moneyBank=WishlistBank.money_bank;

        System.out.println("Okay! Now that we have that all set, lets continue.");

        System.out.println();
        System.out.println("What item from your database would you like to access? (1,2,3, or 4)");
        choice=in.next();

        //TODO fully setup calculations for all possible options

        if(choice.equals("1")) {
            itemName=WishlistAccess.item_name1;
            itemCost=WishlistAccess.item_cost1;
        }
        else if(choice.equals("2")) {
            itemName=WishlistAccess.item_name2;
            itemCost=WishlistAccess.item_cost2;
        }
        else if(choice.equals("3")) {
            itemName=WishlistAccess.item_name3;
            itemCost=WishlistAccess.item_cost3;
        }
        else if(choice.equals("4")) {
            itemName=WishlistAccess.item_name4;
            itemCost=WishlistAccess.item_cost4;
        }
    }
}
