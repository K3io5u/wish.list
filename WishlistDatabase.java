package wish.list;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class WishlistDatabase extends WishlistMain {

	WishlistDatabase() {
		super();
	}

	public void database() throws FileNotFoundException {
        String[] item = new String[100];
        double[] cost = new double[100];
        String confirm, fileName;
        int i = 1;

        System.out.println();
        System.out.println("Hello! Welcome to the Wishlist Database!");
        System.out.println();
        System.out.println("What would you like to name your database?");
        fileName = input.nextLine();

        File fin = new File(fileName);

        if (fin.exists() && !fin.isDirectory()) do {
            System.out.println();
            System.out.println("That file name already exists. Please enter another file name: ");
            fileName = input.nextLine();
        }
        while (fin.exists() && !fin.isDirectory());

        PrintWriter out = new PrintWriter(fileName);

        System.out.println();
        System.out.println("Enter your first item: ");
        item[0] = input.nextLine();

        System.out.println("Enter the cost of that item: ");
        cost[0] = Double.parseDouble(input.nextLine());

        out.println(item[0]);
        out.println(cost[0]);

        System.out.println("Item Stored!");
        System.out.println();

        do {
            System.out.println("Would you like to store another value? (yes/no)");
            confirm = input.nextLine();

            if (confirm.equals("yes")) {
                System.out.println("Enter an item: ");
                item[i] = input.nextLine();

                System.out.println("Enter the cost of that item: ");
                cost[i] = Double.parseDouble(input.nextLine());

                out.println(item[i]);
                out.println(cost[i]);

                System.out.println("Item Stored!");
                System.out.println();

                i++;
            }
        }
        while (confirm.equals("yes"));

        System.out.println("Okay! Thank you for using Wishlist Database! All items (if any) have been stored!");
        System.out.println();
        System.out.println("Thank you for using Wishlist!");

        out.flush();
        out.close();
	}
}
