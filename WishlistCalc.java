package wish.list;

public class WishlistCalc extends WishlistMain {

	WishlistCalc() {
		super();
	}

	public void calc() {
        double income, weeksTill, moneyNeed, moneyBank;
        String payRate, itemName, confirm;
        double dis_in, max_dis;

        System.out.println();
        System.out.println("Hello! Welcome to Wishlist Calculator!");
        System.out.println();

        itemName = WishlistInitial.item_name;
        moneyNeed = WishlistInitial.money_need;
        moneyBank = WishlistInitial.money_bank;

        System.out.println("You are saving up for " + itemName + ", correct? (yes/no)");
        confirm = input.nextLine();

        if (confirm.equals("yes")) {
            System.out.println();
            System.out.println("Great! And so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");
            System.out.println();
            System.out.println("Could you start by stating whether you get paid weekly or bi-weekly?");
            payRate = input.nextLine();

            if ("weekly".equals(payRate)) {
                System.out.println("Okay and how much do you make per week?");
                income = Double.parseDouble(input.nextLine());

                System.out.println("Okay so if you make " + income + " dollars a week, and you need " + moneyNeed + ". Then we can calculate how long you still have to save for.");
                System.out.println();
                System.out.println("How much disposable income do you have?");
                dis_in = Double.parseDouble(input.nextLine());

                System.out.println();
                System.out.println("How much of that disposable income would you like to put towards " + itemName + " each week?");
                max_dis = Double.parseDouble(input.nextLine());

                System.out.println();
                System.out.println("Okay so you make " + income + " every week and you are able to spend " + dis_in + " each week and plan to put away " + max_dis + " every week towards " + itemName + ".");

                weeksTill = (moneyNeed / max_dis);

                System.out.println();
                System.out.println("Calculating...");
                System.out.println();
                System.out.println("Okay so if you want to continue saving for " + itemName + " with the set amount of " + max_dis + " being put away each week, then you will need to save for about " + weeksTill + " more weeks!");
                System.out.println();
                System.out.println("Good luck on your saving! Thank you for utilizing Wishlist Calculator!");
            }
            else if ("bi-weekly".equals(payRate)) {
                System.out.println("Okay and how much do you make every 2 weeks?");
                income = Double.parseDouble(input.nextLine());

                System.out.println("Okay so if you make " + income + " dollars every 2 weeks, and you need " + moneyNeed + ". " + "Then we can calculate how long you still have to save for.");
                System.out.println();
                System.out.println("How much disposable income do you have?");
                dis_in = Double.parseDouble(input.nextLine());

                System.out.println();
                System.out.println("How much of that disposable income would you like to put towards " + itemName + " every two weeks?");
                max_dis = Double.parseDouble(input.nextLine());

                System.out.println();
                System.out.println("Okay so you make " + income + " every two weeks and you are able to spend about " + dis_in + " each pay period and plan to put away about " + max_dis + " every other week towards " + itemName + ".");

                weeksTill = (moneyNeed / max_dis) / 2;

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
