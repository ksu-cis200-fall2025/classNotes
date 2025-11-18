/**
 * Represents a Chips item
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class Chips implements DiscountedItem {
    
    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        return "Chips";
    }

    /**
     * Gets the discount price of this item
     * 
     * @return The discount price of this item ($3.99)
     */
    public double getDiscountPrice() {
        //on sale for 3.99
        return 3.99;
    }

    /**
     * Gets the full price of this item
     * 
     * @return The full price of this item ($5.99)
     */
    public double getFullPrice() {
        return 5.99;
    }

    /**
     * Gets a string representation of this item, including its name and price
     * 
     * @return A string representation of this item
     */
    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getFullPrice());
    }
}