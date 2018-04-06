package wish.list;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class WishlistMain {
	public static double money_need;
	public static Scanner input = new Scanner(System.in);

	public WishlistMain() {

	}

	public static void main(String[] args) {
        try {
            double moneyBank, itemCost, moneyNeed;
            String itemName, dataAgree, calcAgree;
            String dataBase;

            WishlistInitial greet = new WishlistInitial();
            greet.welcome();

            System.out.println("Do you have a database file with this program from a previous use? (yes/no)");
            dataBase = input.nextLine();

            if (dataBase.equals("yes")) {
                WishlistAccess file = new WishlistAccess();
                file.access();

                System.out.println();
                System.out.println("Now that you have accessed your file and its items you will be transferred to the Access Calculator to choose the item you wish to calculate.");
                System.out.println();
                System.out.println("Transferring now.. Thank you!");
                System.out.println();

                WishlistDataCalc mathD = new WishlistDataCalc();
                mathD.dataCalc();
            }
            else if (dataBase.equals("no")) {
                System.out.println();
                System.out.println("Okay! Let us start from scratch then.");
                System.out.println();

                WishlistInitial main = new WishlistInitial();
                main.name(input);
                main.cost(input);

                WishlistInitial have = new WishlistInitial();
                have.bank(input);

                itemName = WishlistInitial.item_name;
                itemCost = WishlistInitial.item_cost;
                moneyBank = WishlistInitial.money_bank;
                moneyNeed = itemCost - moneyBank;
                money_need = moneyNeed;

                if (moneyBank < itemCost) {
                    System.out.println();
                    System.out.printf("You still need: %.2f dollars %n", moneyNeed);
                    System.out.println();
                    System.out.printf("Money acquired = %.2f dollars %n", moneyBank);
                    System.out.println();
                    System.out.println("Would you like to use the Wishlist Calculator to see how long it would take you to get " + itemName + "? (yes/no)");
                    calcAgree = input.nextLine();

                    if (calcAgree.equals("yes")) {
                        System.out.println("Okay! Lets get started! I will transfer you to the Wishlist Calculator!");
                        System.out.println();

                        WishlistCalc math = new WishlistCalc();
                        math.calc();
                    }
                    else if (calcAgree.equals("no")) {
                        System.out.println();
                        System.out.println("Okay, you are welcome to utilize it anytime!");
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
                dataAgree = input.nextLine();

                if (dataAgree.equals("yes")) {
                    System.out.println();
                    System.out.println("Okay! I will transfer you to the Wishlist Database to store some items of yours to use again later!");
                    System.out.println();

                    WishlistDatabase data = new WishlistDatabase();
                    data.database();
                }
                else if (dataAgree.equals("no")) {
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
