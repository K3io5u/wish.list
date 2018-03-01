package wish.list;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WishlistArray extends WishlistMain {

    public WishlistArray() {
        super();
    }

    public void WiArray() throws FileNotFoundException {
        String item_name, confirm, fileName;

        Scanner input = new Scanner(System.in);

        ArrayList<String> itemNames = new ArrayList<>();
        System.out.println();
        System.out.println("Enter your first item: ");
        item_name = input.nextLine();

        itemNames.add(item_name);

        fileName = "ArrayTest";

        PrintWriter out = new PrintWriter("C:\\Users\\lavoiet2\\Downloads\\Coding\\WishlistDatabaseFiles\\" + fileName);

        do {
            System.out.println("Would you like to store another value?");
            confirm = input.nextLine();

            if (confirm.equals("yes")) {
                System.out.println("Enter an item: ");
                item_name = input.nextLine();
                out.println(item_name);
            }
        }
        while (confirm.equals("yes"));

    }
}
