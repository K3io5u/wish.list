package wish.list;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WishlistDatabase extends WishlistMain {
    public String item_name1, item_name2, item_name3;
    public double item_cost1, item_cost2, item_cost3;

    public WishlistDatabase() {
        super();
    }

    public void Database() throws FileNotFoundException {
        String itemName, itemName1, itemName2, itemName3;
        double itemCost, itemCost1, itemCost2, itemCost3;
        String confirm, confirm1, confirm2, confirm3;

        Scanner reader = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter("WishlistDatabase.txt");

        System.out.println("Hello! Welcome to the Wishlist Database!");
        System.out.println();

        itemName=WishlistInitial.item_name;
        itemCost=WishlistInitial.item_cost;

        System.out.println("Would you like to store the initial item you started Wishlist with? (yes/no)");
        confirm=input.next();

        if (confirm.equals("yes")) {
            out.println(itemName);
            out.println(itemCost);
        }
        else if (confirm.equals("no")) {
            System.out.println();
            System.out.println("");
        }

        System.out.println();
        System.out.println("Would you like to store any other items into the database? (yes/no)");
        confirm1=input.next();

        if (confirm1.equals("yes")) {
            System.out.println();
            System.out.println("Okay! This database can hold up to three additional items, so lets get started!");
            System.out.println();

            System.out.println("What is the name of the first item would you like to store?");
            itemName1=reader.nextLine();
            System.out.println("And what is the price of " + itemName1 + "?");
            itemCost1=reader.nextDouble();

            out.println(itemName1);
            out.println(itemCost1);

            System.out.println("Would you like to store another item? (yes/no)");
            confirm2=input.next();

            if (confirm2.equals("yes")) {
                System.out.println();
                System.out.println("Okay! What is the name of your second item?");
                itemName2=reader.nextLine();
                System.out.println("And what is the price of " + itemName2 + "?");
                itemCost2=reader.nextDouble();

                out.println(itemName2);
                out.println(itemCost2);


            }
            else if (confirm2.equals("no")) {
                System.out.println();
                System.out.println("");
            }
        }
        else if (confirm1.equals("no")) {

        }

        out.close();
        input.close();
        reader.close();
    }

}
