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

    public void Access() throws FileNotFoundException{
        String fileName, itemName1, itemName2, itemName3, itemName4;
        double itemCost1, itemCost2, itemCost3, itemCost4;

        System.out.println();
        System.out.println("Okay! Lets go and access your file then.");

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Please enter your file name: ");
        fileName=input.nextLine();

        File text = new File("C:\\Users\\lavoiet2\\Downloads\\Coding\\WishlistDatabaseFiles\\" + fileName);
        Scanner scnr = new Scanner(text);

        scnr.hasNextLine();
        itemName1 = scnr.nextLine();

        scnr.hasNextDouble();
        itemCost1 = scnr.nextDouble();

        System.out.println();
        System.out.println("The first item retrieved was '" + itemName1 + "' and it costs " + itemCost1 + " dollars.");

        item_name1 = itemName1;
        item_cost1 = itemCost1;

        //TODO make it so the scanner can read for more than just one item

        scnr.close();
    }
}
