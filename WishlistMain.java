package wish.list;

import java.util.Scanner;
import java.io.FileNotFoundException;

public class WishlistMain {
    public static double money_need; //public variable for how much the user still needs

    public WishlistMain() {

    }

    public static void main(String[] args) throws FileNotFoundException {
        double moneyBank, itemCost, moneyNeed;
        String itemName, dataAgree, calcAgree;

        Scanner input = new Scanner(System.in);
        Scanner reader = new Scanner(WishlistDatabase.file_name);

        WishlistInitial main = new WishlistInitial();//creates an object within the main method to call other methods from the WishlistInitial Class
        main.Welcome();//calls the Welcome method
        main.ItemName(input);//calls the ItemName method
        main.ItemCost(input);//calls the ItemCost method
        main.MoneyBank(input);//calls the MoneyBank method

        itemName=WishlistInitial.item_name;//what you want, declared by the global variable

        itemCost=WishlistInitial.item_cost;//how much it is, declared by the global variable

        moneyBank=WishlistInitial.money_bank;//how much you have, declared by the global variable

        moneyNeed=itemCost-moneyBank;//the difference between how much it is and how much you've saved

        money_need=moneyNeed;//sets the local moneyNeed variable to the global variable of money_need

        //if-else statement that determines whether you can get it, and how much you need if you can't
        if (moneyBank < itemCost) {
            System.out.println();
            System.out.printf("You still need: %.2f dollars %n", moneyNeed);

            System.out.println();
            System.out.printf("Money acquired = %.2f dollars %n", moneyBank);

            System.out.println();
            System.out.println("Would you like to use the Wishlist Calculator to see how long it would take you to get " + itemName + "? (yes/no)");
            calcAgree=input.next();//asks the user whether or not they want to access the WishlistCalc class and use its assests

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
        dataAgree=input.next();//asks the user whether or not they want to access the WishlistDatabase class and use its assests

        if (dataAgree.equals("yes")) {
            System.out.println();
            System.out.println("Okay! I will transfer you to the Wishlist Database to store some items of yours to use again later!");
            System.out.println();

            WishlistDatabase data = new WishlistDatabase();
            data.Database();//calls the Database method within the WishlistDatabase class to be initialized
        }
        else if (dataAgree.equals("no")) {
            System.out.println();
            System.out.println("Okay, you are welcome to utilize it anytime! Thank you for using Wishlist!");
        }

        input.close();
        reader.close();
    }

}
