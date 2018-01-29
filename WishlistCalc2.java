package wish.list;

import java.util.Scanner;

public class WishlistCalc2 extends WishlistMain {

	public WishlistCalc2() {
		super();
	}

	@SuppressWarnings("Duplicates") //there is a lot of duplicate code here from another method and from itself that is intentional so duplicates are suppressed
	public void Calc2() {
		double income, weeksTill, moneyNeed, moneyBank, itemCost;
		String payRate, itemName, choice;

		Scanner in = new Scanner(System.in);

		System.out.println("Hello and welcome to the Wishlist Access Calculator where you can calculate how long it will take you to get items from your Database file!");
		System.out.println();

		System.out.println("First off we have to find out how much money you have for the item you want. So we shall start there.");
		System.out.println();

		WishlistBank call = new WishlistBank();//creates an object inside the Calc2 method to call the MoneyBank method
		call.MoneyBank(in);//calls the MoneyBank method

		moneyBank = WishlistBank.money_bank;//how much money you have declared by the global variable

		System.out.println("Okay! Now that we have that all set, lets continue.");

		System.out.println();
		System.out.println("What item from your database would you like to access? (1, 2, 3, or 4)");
		choice = in.nextLine();

		if (choice.equals("1")) {
			itemName = WishlistAccess.item_name1;//what you want declared by the global variable based on the database
			itemCost = WishlistAccess.item_cost1;//how much it is declared by the global variable based on the database

			moneyNeed = itemCost - moneyBank;//the difference between how much it is and how much you've saved

			System.out.println();
			System.out.println("Okay we will do calculations for " + itemName + " then.");

			System.out.println();
			System.out.println("Okay and from all of that we can gather that so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");
			System.out.println();//restating how much money the user has and how much more they need for the item

			System.out.println("Now we can start the calculations for " + itemName + ".");

			System.out.println();
			System.out.println("Alright, could you start by stating whether you get paid weekly or bi-weekly?");
			payRate = in.next();//taking the input for the user's pay rate

			if (payRate.equals("weekly")) {
				System.out.println("Okay and how much do you make per week?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every week

				System.out.println("Okay so if you make " + income + " dollars a week, and you need " + moneyNeed + ". Then we can calculate how long you still have to save for.");
				System.out.println();

				weeksTill = (moneyNeed / income);//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else if (payRate.equals("bi-weekly")) {
				System.out.println("Okay and how much do you make every 2 weeks?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every two weeks

				System.out.println("Okay so if you make " + income + " dollars every 2 weeks, and you need " + moneyNeed + ". " + "Then we can calculate how long you still have to save for.");

				weeksTill = (moneyNeed / income) / 2;//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else {
				System.out.println();
				System.out.println("I'm sorry I can't understand what you entered. Goodbye.");

				System.exit(0);
			}
		} else if (choice.equals("2")) {
			itemName = WishlistAccess.item_name2;//what you want declared by the global variable based on the database
			itemCost = WishlistAccess.item_cost2;//how much it is declared by the global variable based on the database

			moneyNeed = itemCost - moneyBank;//the difference between how much it is and how much you've saved

			System.out.println();
			System.out.println("Okay we will do calculations for " + itemName + " then.");

			System.out.println();
			System.out.println(" Okay and from all of that we can gather that so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");
			System.out.println();//restating how much money the user has and how much more they need for the item

			System.out.println("Now we can start the calculations for " + itemName + ".");

			System.out.println();
			System.out.println("Alright, could you start by stating whether you get paid weekly or bi-weekly?");
			payRate = in.nextLine();//taking the input for the user's pay rate

			if (payRate.equals("weekly")) {
				System.out.println("Okay and how much do you make per week?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every week

				System.out.println("Okay so if you make " + income + " dollars a week, and you need " + moneyNeed + ". Then we can calculate how long you still have to save for.");
				System.out.println();

				weeksTill = (moneyNeed / income);//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else if (payRate.equals("bi-weekly")) {
				System.out.println("Okay and how much do you make every 2 weeks?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every two weeks

				System.out.println("Okay so if you make " + income + " dollars every 2 weeks, and you need " + moneyNeed + ". " + "Then we can calculate how long you still have to save for.");

				weeksTill = (moneyNeed / income) / 2;//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else {
				System.out.println();
				System.out.println("I'm sorry I can't understand what you entered. Goodbye.");

				System.exit(0);
			}
		} else if (choice.equals("3")) {
			itemName = WishlistAccess.item_name3;//what you want declared by the global variable based on the database
			itemCost = WishlistAccess.item_cost3;//how much it is declared by the global variable based on the database

			moneyNeed = itemCost - moneyBank;//the difference between how much it is and how much you've saved

			System.out.println();
			System.out.println("Okay we will do calculations for " + itemName + " then.");

			System.out.println();
			System.out.println(" Okay and from all of that we can gather that so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");
			System.out.println();//restating how much money the user has and how much more they need for the item

			System.out.println("Now we can start the calculations for " + itemName + ".");

			System.out.println();
			System.out.println("Alright, could you start by stating whether you get paid weekly or bi-weekly?");
			payRate = in.nextLine();//taking the input for the user's pay rate

			if (payRate.equals("weekly")) {
				System.out.println("Okay and how much do you make per week?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every week

				System.out.println("Okay so if you make " + income + " dollars a week, and you need " + moneyNeed + ". Then we can calculate how long you still have to save for.");
				System.out.println();

				weeksTill = (moneyNeed / income);//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else if (payRate.equals("bi-weekly")) {
				System.out.println("Okay and how much do you make every 2 weeks?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every two weeks

				System.out.println("Okay so if you make " + income + " dollars every 2 weeks, and you need " + moneyNeed + ". " + "Then we can calculate how long you still have to save for.");

				weeksTill = (moneyNeed / income) / 2;//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else {
				System.out.println();
				System.out.println("I'm sorry I can't understand what you entered. Goodbye.");

				System.exit(0);
			}
		} else if (choice.equals("4")) {
			itemName = WishlistAccess.item_name4;//what you want declared by the global variable based on the database
			itemCost = WishlistAccess.item_cost4;//how much it is declared by the global variable based on the database

			moneyNeed = itemCost - moneyBank;//the difference between how much it is and how much you've saved

			System.out.println();
			System.out.println("Okay we will do calculations for " + itemName + " then.");

			System.out.println();
			System.out.println(" Okay and from all of that we can gather that so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");
			System.out.println();//restating how much money the user has and how much more they need for the item

			System.out.println("Now we can start the calculations for " + itemName + ".");

			System.out.println();
			System.out.println("Alright, could you start by stating whether you get paid weekly or bi-weekly?");
			payRate = in.nextLine();//taking the input for the user's pay rate

			if (payRate.equals("weekly")) {
				System.out.println("Okay and how much do you make per week?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every week

				System.out.println("Okay so if you make " + income + " dollars a week, and you need " + moneyNeed + ". Then we can calculate how long you still have to save for.");
				System.out.println();

				weeksTill = (moneyNeed / income);//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else if (payRate.equals("bi-weekly")) {
				System.out.println("Okay and how much do you make every 2 weeks?");
				income = Double.parseDouble(in.nextLine());//taking the input for how much the user makes every two weeks

				System.out.println("Okay so if you make " + income + " dollars every 2 weeks, and you need " + moneyNeed + ". " + "Then we can calculate how long you still have to save for.");

				weeksTill = (moneyNeed / income) / 2;//calculating how many weeks it takes till the user can get the item
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Access Calculator!");
			} else {
				System.out.println();
				System.out.println("I'm sorry I can't understand what you entered. Goodbye.");

				System.exit(0);
			}
		}
	}
}
