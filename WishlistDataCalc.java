package wish.list;

public class WishlistDataCalc extends WishlistMain{

    WishlistDataCalc() {
        super();
    }

    public void dataCalc() {
        double income, weeksTill, moneyNeed, moneyBank, itemCost;
        String payRate, itemName, confirm;
        double dis_in, max_dis;
        int i = 0;

        System.out.println();
        System.out.println("Hello and welcome to the Wishlist Access Calculator where you can calculate how long it will take you to get items from your Database file!");
        System.out.println();
        System.out.println("First off we have to find out how much money you have for the item you want. So we shall start there.");
        System.out.println();

        WishlistInitial money = new WishlistInitial();
        money.bank(input);

        moneyBank = WishlistInitial.money_bank;

        System.out.println("Okay! Now that we have that all set, lets continue!");
        System.out.println();
        System.out.println("Would you like to start calculating? (yes/no)");
        confirm = input.nextLine();

        do {
            itemName = WishlistAccess.item[i];
            itemCost = WishlistAccess.cost[i];

            moneyNeed = itemCost - moneyBank;

            System.out.println();
            System.out.println("Okay we will do calculations for the next item in your file, which is " + itemName + ".");
            System.out.println();
            System.out.println("Okay and from all of that we can gather that so far you have " + moneyBank + " dollars. And you need " + moneyNeed + " dollars more in order to get " + itemName + ".");
            System.out.println();
            System.out.println("Now we can start the calculations for " + itemName + ".");
            System.out.println();
            System.out.println("Alright, could you start by stating whether you get paid weekly or bi-weekly?");
            payRate = input.next();

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
                System.out.println("Good luck on your saving! Would you like to calculate another item in your file (if one is present)? (yes/no)");
                confirm = input.nextLine();
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
                System.out.println("Good luck on your saving! Would you like to calculate another item in your file (if one is present)? (yes/no)");
                confirm = input.nextLine();
            }
            else {
                System.out.println();
                System.out.println("I'm sorry I can't understand what you entered. Goodbye.");
                System.exit(0);
            }

            i++;
        }
        while (confirm.equals("yes") && input.hasNextLine());

        System.out.println();
        System.out.println("Thank you for utilizing Wishlist Access Calculator!");
        System.out.println();
        System.out.println("Thank you for using Wishlist!");
    }
}
