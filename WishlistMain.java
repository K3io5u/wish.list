package wish.list;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class WishlistMain {
	public static double money_need; //public variable for how much the user still needs

	public WishlistMain() {

	}

	public static void main(String[] args) {
		try {
			double moneyBank, itemCost, moneyNeed;
			String itemName, dataAgree, calcAgree;
			String dataBase;

			Scanner input = new Scanner(System.in);

			WishlistInitial greet = new WishlistInitial();//creates an object within the main method to call other methods from the WishlistInitial Class
			greet.Welcome();//calls the Welcome method

			System.out.println("Do you have a database file with this program from a previous use? (yes/no)");
			dataBase = input.nextLine();

			if (dataBase.equals("yes")) {
				WishlistAccess file = new WishlistAccess();//creats an object within the main method to call the method from the WishlistAccess Class
				file.Access();//calls the Access method

				System.out.println();
				System.out.println("Now that you have accessed your file and its items you will be transferred to the Access Calculator to choose the item you wish to calculate.");
				System.out.println();
				System.out.println("Transferring now.. Thank you!");
				System.out.println();

				WishlistCalc2 two = new WishlistCalc2();
				two.Calc2();
			} else if (dataBase.equals("no")) {
				System.out.println();
				System.out.println("Okay! Let us start from scratch then.");
				System.out.println();

				WishlistInitial main = new WishlistInitial();//creates an object within the main method to call other methods from the WishlistInitial Class
				main.ItemName(input);//calls the ItemName method
				main.ItemCost(input);//calls the ItemCost method

				WishlistBank initial = new WishlistBank();//creates an object within the main method to call other methods from the WishlistBank Class
				initial.MoneyBank(input);//calls the MoneyBank method

				itemName = WishlistInitial.item_name;//what you want, declared by the global variable

				itemCost = WishlistInitial.item_cost;//how much it is, declared by the global variable

				moneyBank = WishlistBank.money_bank;//how much you have, declared by the global variable

				moneyNeed = itemCost - moneyBank;//the difference between how much it is and how much you've saved

				money_need = moneyNeed;//sets the local moneyNeed variable to the global variable of money_need

				//if-else statement that determines whether you can get it, and how much you need if you can't
				if (moneyBank < itemCost) {
					System.out.println();
					System.out.printf("You still need: %.2f dollars %n", moneyNeed);

					System.out.println();
					System.out.printf("Money acquired = %.2f dollars %n", moneyBank);

					System.out.println();
					System.out.println("Would you like to use the Wishlist Calculator to see how long it would take you to get " + itemName + "? (yes/no)");
					calcAgree = input.nextLine();//asks the user whether or not they want to access the WishlistCalc class and use its assests

					if (calcAgree.equals("yes")) {
						System.out.println("Okay! Lets get started! I will transfer you to the Wishlist Calculator!");
						System.out.println();

						WishlistCalc math = new WishlistCalc();
						math.Calc();//calls the Calc method within the WishlistCalc class to be initialized
					}
					else if (calcAgree.equals("no")) {
						System.out.println();
						System.out.println("Okay, you are welcome to utilize it anytime! Thank you for using Wishlist!");
					}
				}
				else {
					System.out.println();
					System.out.println("You have enough money to get " + itemName + "!");
					System.out.println();
					System.out.println("Thank you for using and trying out Wishlist!");
				}


                    System.out.println();
                    System.out.println("Would you like to store this item and maybe other items in this app to use and look up again? (yes/no)");
                    dataAgree = input.nextLine();//asks the user whether or not they want to access the WishlistDatabase class and use its assests

                    if (dataAgree.equals("yes")) {
                        System.out.println();
                        System.out.println("Okay! I will transfer you to the Wishlist Database to store some items of yours to use again later!");
                        System.out.println();

                        WishlistDatabase data = new WishlistDatabase();
                        data.Database();//calls the Database method within the WishlistDatabase class to be initialized
                    } else if (dataAgree.equals("no")) {
                        System.out.println();
                        System.out.println("Okay, you are welcome to utilize it anytime! Thank you for using Wishlist!");
                    }
                }

			input.close();

		} catch (FileNotFoundException ex) {
			System.out.println("File could not be found.");
			System.exit(0);
		}

	}
}
