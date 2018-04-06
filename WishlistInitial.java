package wish.list;

import java.util.Scanner;

public class WishlistInitial extends WishlistMain {
	public static String item_name;
	public static double item_cost;
	public static double money_bank;

	public WishlistInitial() {
		super();
	}

    public void welcome() {
        System.out.println("Welcome to Wishlist!");
        System.out.println();
    }

    public String name(Scanner input) {
        String itemName;

        System.out.println("What is it you are saving for? ");
        itemName = input.nextLine();

        item_name = itemName;

        return itemName;
    }

    public double cost(Scanner input) {
        double itemCost;
        String itemName = item_name;

        System.out.println("How much is " + itemName + "?");
        itemCost = Double.parseDouble(input.nextLine());

        item_cost = itemCost;

        return itemCost;
    }

    public double bank(Scanner input) {
        double moneyBank;

        System.out.println("Enter the amount of money you have saved: ");
        moneyBank = Double.parseDouble(input.nextLine());

        money_bank = moneyBank;

        return moneyBank;
    }
}
