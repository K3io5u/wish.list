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
		System.out.println("Please enter your file name: ");//askes the user for the name of their database file
		fileName = input.nextLine();//sets the variable to the inputted file name

		File text = new File("C:\\Users\\lavoiet2\\Downloads\\Coding\\WishlistDatabaseFiles\\" + fileName);//sets the path of what file to read
		Scanner scnr = new Scanner(text);

		if (scnr.hasNextLine()) { //tests if the file has lines written
            itemName1 = scnr.nextLine();//sets the first string in the file as the name of the item

            itemCost1 = Double.parseDouble(scnr.nextLine());//sets the next line and first double of the file to the cost of the item

            System.out.println();
            System.out.println("The first item retrieved was '" + itemName1 + "' and it costs " + itemCost1 + " dollars.");

            item_name1 = itemName1;//sets the global variable equal to the local variable
            item_cost1 = itemCost1;//sets the global variable equal to the local variable
        }

        if (scnr.hasNextLine()) { //tests if the file has any more lines written
            itemName2 = scnr.nextLine();//sets the second string in the file as the name of the second item

            itemCost2 = Double.parseDouble(scnr.nextLine());//sets the second double in the file as the cost of the item

            System.out.println();
            System.out.println("The second item retrieved was '" + itemName2 + "' and it costs " + itemCost2 + " dollars.");

            item_name2 = itemName2;//sets the global variable equal to the local variable
            item_cost2 = itemCost2;//sets the global variable equal to the local variable
        }
        else { //prints a statement if there are no further items found
		    System.out.println();
		    System.out.print("No more items were listed, file fully accessed.");
        }

        if (scnr.hasNextLine()) { //tests if the file has any more lines written
		    itemName3 = scnr.nextLine();//sets the third string in the file as the name of the third item

		    itemCost3 = Double.parseDouble(scnr.nextLine());//sets the third double in the file as the cost of the item

		    System.out.println();
		    System.out.println("The third item retrieved was '" + itemName3 + "' and it costs " + itemCost3 + " dollars");

		    item_name3 = itemName3;//sets the global variable equal to the local variable
		    item_cost3 = itemCost3;//sets the global variable equal to the local variable
        }
        else { //prints a statement if there are no further items found
            System.out.println();
            System.out.print("No more items were listed, file fully accessed.");
        }

        if (scnr.hasNextLine()) { //tests if the file has any more lines written
		    itemName4 = scnr.nextLine();//sets the fourth string in the file sa the name of the fourth item

		    itemCost4 = Double.parseDouble(scnr.nextLine());//sets the fourth double in the file as the cost of the item

		    System.out.println();
		    System.out.println("The fourth item retrieved was '" + itemName4 + "' and it costs " + itemCost4 + " dollars");

		    item_name4 = itemName4;//sets the the global variable equal to the local variable
		    item_cost4 = itemCost4;//sets the global variable equal to the local variable
        }
        else { //prints a statement if there are no further items found
            System.out.println();
            System.out.print("No more items were listed, file fully accessed.");
        }

		scnr.close();
	}
}
