package wish.list;

import java.util.Scanner;

public class WishlistInitial extends WishlistMain {
	static String item_name;
	static double item_cost;
	static double money_bank;

	WishlistInitial() {
		super();
	}

    public void welcome() {
        System.out.println("Welcome to Wishlist!");
        System.out.println();
    }

    public void name(Scanner input) {
        String itemName;

        System.out.println("What is it you are saving for? ");
        itemName = input.nextLine();

        item_name = itemName;
    }

    public void cost(Scanner input) {
        double itemCost;
        String itemName = item_name;

        System.out.println("How much is " + itemName + "?");
        itemCost = Double.parseDouble(input.nextLine());

        item_cost = itemCost;
    }

    public void bank(Scanner input) {
        double moneyBank;

        System.out.println("Enter the amount of money you have saved: ");
        moneyBank = Double.parseDouble(input.nextLine());

        money_bank = moneyBank;
    }
}
