package wish.list;

import java.util.Scanner;

public class WishlistCalc extends WishlistMain {

    public WishlistCalc() {
        super();
    }

    public void Calc() {
        //public method that holds all the calculations and prints for the WishlistCalc class

        double income, weeksTill, moneyNeed, moneyBank;
        String payRate, itemName, confirm;

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Hello! Welcome to the Wishlist Calculator!");
        System.out.println();

        itemName=WishlistInitial.item_name;//what you want, delcared by the global variable

        moneyNeed=WishlistInitial.money_need;//how much it is, delcared by the global variable

        moneyBank=WishlistInitial.money_bank;//how much you have, delcared by the global variable

        System.out.println("You are saving up for " + itemName + ", correct? (yes/no)");
        confirm=input.nextLine();

        if (confirm.equals("yes")) {
            System.out.println();

            System.out.println("Great! And so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");

            System.out.println();

            System.out.println("Could you start by stating whether you get paid weekly or bi-weekly?");
            payRate=input.nextLine();

            if (payRate.equals("weekly")) {

                System.out.println("Okay and how much do you make per week?");
                income=input.nextDouble();

                System.out.println("Okay so if you make " + income + " dollars a week, and you need " + moneyNeed + ". Then we can calculate how long you still have to save for.");

                weeksTill=(moneyNeed/income);

                System.out.println();

                System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
            }
            else if (payRate.equals("bi-weekly")) {

                System.out.println("Okay and how much do you make every 2 weeks?");
                income=input.nextDouble();

                System.out.println("Okay so if you make " + income + " dollars every 2 weeks, and you need " + moneyNeed + ". " + "Then we can calculate how long you still have to save for.");

                weeksTill=(moneyNeed/income)/2;

                System.out.println();

                System.out.println("Okay so if you want to continue saving for " + itemName + " then you will need to save for about " + weeksTill + " more weeks!");
                System.out.println();
                System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Calculator!");

            }
            else {
                System.out.println();
                System.out.println("I'm sorry I can't understand what you entered. Goodbye.");
            }
        }
        else if (confirm.equals("no")) {
            System.out.println("Okay, please utilize the Intial Wishlist Application in order to continue with this program. " + "\nIf the wrong item showed up please redo the input in the Intial Wishlist Application.");
        }

        input.close();
    }

}
