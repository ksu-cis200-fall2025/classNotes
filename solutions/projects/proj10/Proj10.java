import java.util.*;

/**
 * Project 10 creates a random or standard grocery order and
 * prints several summaries of the items
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class Proj10 {
    public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equals("--standard")) {
                GroceryOrder order = new GroceryOrder();
                order.createStandardOrder();

                printFullOrderInfo(order, "standard");
                printCountableItems(order, "standard");
                printDiscountedItems(order, "standard");
            }
            else if (args[0].equals("--random")) {
                GroceryOrder order = new GroceryOrder();
                order.createRandomOrder();

                printFullOrderInfo(order, "random");
                printCountableItems(order, "random");
                printDiscountedItems(order, "random");
            }
            else {
                System.out.println("Invalid command line argument.");
                System.out.println("Run as: java Proj10 --standard");
                System.out.println("Or: java Proj10 --random");
            }
        }
        else {
            System.out.println("Missing command line argument.");
            System.out.println("Run as: java Proj10 --standard");
            System.out.println("Or: java Proj10 --random");
        }
    }

    /**
     * Prints all items in the grocery order
     * 
     * @param order The grocery order
     * @param type Either "random" or "standard"
     */
    public static void printFullOrderInfo(GroceryOrder order, String type) {
        System.out.printf("All grocery items from %s order:%n", type);
        for (GroceryItem item : order.getAllItems()) {
            System.out.println("\t" + item);
        }
        System.out.println();

        System.out.printf("Total before discounts: $%.2f%n", order.getTotal());
        System.out.printf("Total after discounts: $%.2f%n", order.getDiscountedTotal());
        System.out.printf("Total savings: $%.2f%n", order.getSavings());
        System.out.println();
    }

    /**
     * Prints all countable items in the grocery order
     * 
     * @param order The grocery order
     * @param type Either "random" or "standard"
     */
    public static void printCountableItems(GroceryOrder order, String type) {
        System.out.printf("Countable %s grocery items:%n", type);
        for (CountableItem item : order.getAllCountableItems()) {
            System.out.printf("\t%s, count: %d, unit price: $%.2f%n", item.getName(), item.getCount(), item.getUnitPrice());
        }
        System.out.println();
    }

    /**
     * Prints all discounted items in the grocery order
     * 
     * @param order The grocery order
     * @param type Either "random" or "standard"
     */
    public static void printDiscountedItems(GroceryOrder order, String type) {
        System.out.printf("Discounted %s grocery items:%n", type);
        for (DiscountedItem item : order.getAllDiscountedItems()) {
            System.out.printf("\t%s, full price: $%.2f, discounted price: $%.2f%n", item.getName(), item.getFullPrice(), item.getDiscountPrice());
        }
        System.out.println();
    }
}