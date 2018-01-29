package wish.list;

import java.util.Scanner;

public class WishlistBank extends WishlistMain {
	public static double money_bank;//public variable for how much money the user has

	public WishlistBank() {
		super();
	}

	public double MoneyBank(Scanner input) {

		//public method to store how much money the user has saved

		double moneyBank;

		System.out.println("Enter the amount of money you have saved: ");
		moneyBank = Double.parseDouble(input.nextLine());

		money_bank = moneyBank;

		return moneyBank;
	}
}
