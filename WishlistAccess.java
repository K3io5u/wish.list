package wish.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WishlistAccess extends WishlistMain {
	public static String item_name1, item_name2, item_name3, item_name4;//public variables for the name of the items stored
	public static double item_cost1, item_cost2, item_cost3, item_cost4;//public variables for the cost of the items stored

	public WishlistAccess() {
		super();
	}

	public void Access() throws FileNotFoundException {
		String fileName, itemName1, itemName2, itemName3, itemName4;
		double itemCost1, itemCost2, itemCost3, itemCost4;

		System.out.println();
		System.out.println("Okay! Lets go and access your file then.");

		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.println("Please enter your file name: ");
		fileName = input.nextLine();

		File text = new File("C:\\Users\\lavoiet2\\Downloads\\Coding\\WishlistDatabaseFiles\\" + fileName);
		Scanner scnr = new Scanner(text);

		if (scnr.hasNextLine()) {
            itemName1 = scnr.nextLine();

            itemCost1 = Double.parseDouble(scnr.nextLine());

            System.out.println();
            System.out.println("The first item retrieved was '" + itemName1 + "' and it costs " + itemCost1 + " dollars.");

            item_name1 = itemName1;
            item_cost1 = itemCost1;
        }

        if (scnr.hasNextLine()) {
            itemName2 = scnr.nextLine();

            itemCost2 = Double.parseDouble(scnr.nextLine());

            System.out.println();
            System.out.println("The second item retrieved was '" + itemName2 + "' and it costs " + itemCost2 + " dollars.");

            item_name2 = itemName2;
            item_cost2 = itemCost2;
        }
        else {
		    System.out.println();
		    System.out.print("No more items were listed, file fully accessed.");
        }

        if (scnr.hasNextLine()) {
		    itemName3 = scnr.nextLine();

		    itemCost3 = Double.parseDouble(scnr.nextLine());

		    System.out.println();
		    System.out.println("The third item retrieved was '" + itemName3 + "' and it costs " + itemCost3 + " dollars");

		    item_name3 = itemName3;
		    item_cost3 = itemCost3;
        }
        else {
            System.out.println();
            System.out.print("No more items were listed, file fully accessed.");
        }

        if (scnr.hasNextLine()) {
		    itemName4 = scnr.nextLine();

		    itemCost4 = Double.parseDouble(scnr.nextLine());

		    System.out.println();
		    System.out.println("The fourth item retrieved was '" + itemName4 + "' and it costs " + itemCost4 + " dollars");
        }
        else {
            System.out.println();
            System.out.print("No more items were listed, file fully accessed.");
        }

		scnr.close();
	}
}
