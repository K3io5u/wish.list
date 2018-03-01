package wish.list;

import java.util.Scanner;

public class WishlistCalc extends WishlistMain {

	public WishlistCalc() {
		super();
	}

	@SuppressWarnings("Duplicates")
	public void Calc() {
		//public method that holds all the calculations and prints for the WishlistCalc class

		double income, weeksTill, moneyNeed, moneyBank;
		String payRate, itemName, confirm;
		double dis_income, max_dis;

		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.println("Hello! Welcome to the Wishlist Calculator!");
		System.out.println();

		itemName = WishlistInitial.item_name;//what you want, delcared by the global variable

		moneyNeed = WishlistInitial.money_need;//how much it is, delcared by the global variable

		moneyBank = WishlistBank.money_bank;//how much you have, delcared by the global variable

		System.out.println("You are saving up for " + itemName + ", correct? (yes/no)");
		confirm = input.nextLine();//confirmation to make sure the user is calculating for the right item

		if (confirm.equals("yes")) {
			System.out.println();
			System.out.println("Great! And so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");
			System.out.println();////restating how much money the user has and how much more they need for the item

			System.out.println("Could you start by stating whether you get paid weekly or bi-weekly?");
			payRate = input.nextLine();//taking the input for the user's pay rate

			if (payRate.equals("weekly")) {
				System.out.println("Okay and how much do you make per week?");
				income = Double.parseDouble(input.nextLine());//taking the input for how much the user makes every week

				System.out.println("Okay so if you make " + income + " dollars a week, and you need " + moneyNeed + ". Then we can calculate how long you still have to save for.");

				System.out.println();
				System.out.println("How much disposable income do you have?");//asks the user for their disposable income
				dis_income = input.nextDouble();//saves that input

				System.out.println();
				System.out.println("How much of that disposable income would you like to put towards " + itemName + " each week?");//asks the user how much they would like to put towards the item
				max_dis = input.nextDouble();//saves the input

				System.out.println();
				System.out.println("Okay so you make " + income + " every week and you are able to spend " + dis_income + " each week and plan to put away " + max_dis + " every week towards " + itemName + ".");

				weeksTill = (moneyNeed / max_dis);//calculating how many weeks it takes till the user can get the item
				System.out.println();
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " with the set amount of " + max_dis + " being put away each week, then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Calculator!");
			}
			else if (payRate.equals("bi-weekly")) {
				System.out.println("Okay and how much do you make every 2 weeks?");
				income = Double.parseDouble(input.nextLine());//taking the input for how much the user makes every two weeks

				System.out.println("Okay so if you make " + income + " dollars every 2 weeks, and you need " + moneyNeed + ". " + "Then we can calculate how long you still have to save for.");

                System.out.println();
                System.out.println("How much disposable income do you have?");//asks the user for their disposable income
                dis_income = input.nextDouble();//saves the input

                System.out.println();
                System.out.println("How much of that disposable income would you like to put towards " + itemName + " every two weeks?");//asks the user how much they would like to put towards the item
                max_dis = input.nextDouble();//saves the input

                System.out.println();
                System.out.println("Okay so you make " + income + " every two weeks and you are able to spend about " + dis_income + " each pay period and plan to put away about " + max_dis + " every other week towards " + itemName + ".");

				weeksTill = (moneyNeed / max_dis) / 2;//calculating how many weeks it takes till the user can get the item
				System.out.println();
				System.out.println("Calculating...");

				System.out.println();
				System.out.println("Okay so if you want to continue saving for " + itemName + " with the set amount of " + max_dis + " being put away every two weeks, then you will need to save for about " + weeksTill + " more weeks!");
				System.out.println();
				System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Calculator!");
			}
			else {
				System.out.println();
				System.out.println("I'm sorry I can't understand what you entered. Goodbye.");

				System.exit(0);
			}
		}
		else if (confirm.equals("no")) {
			System.out.println("Okay, please utilize the Intial Wishlist Application in order to continue with this program. " + "\nIf the wrong item showed up please redo the input in the Intial Wishlist Application.");

			System.exit(0);
		}
	}
}
