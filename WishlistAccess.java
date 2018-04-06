package wish.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WishlistAccess extends WishlistMain {
    static String[] item = new String[100];
    static double[] cost = new double[100];

	WishlistAccess() {
		super();
	}

	public void access() throws FileNotFoundException {
        String fileName;
        int i = 0;

        System.out.println();
        System.out.println("Okay! Lets go and access your file then.");
        System.out.println();
        System.out.println("Please enter your file name: ");
        fileName = input.nextLine();

        Scanner fin = new Scanner(new File(fileName));

        do {
            item[i] = fin.nextLine();
            cost[i] = Double.parseDouble(fin.nextLine());

            System.out.println();
            System.out.println("Item retrieved: " + item[i] + "\nCost: " + cost[i]);
        }
        while (fin.hasNextLine());

        System.out.println();
        System.out.println("No more items were listed. File fully accessed!");

        fin.close();
	}
}
