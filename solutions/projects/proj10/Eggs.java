/**
 * Represents an Eggs item
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class Eggs implements DiscountedItem {
    
    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        return "Eggs";
    }

    /**
     * Gets the full price of this item
     * 
     * @return The full price of this item ($3.50)
     */
    public double getFullPrice() {
        return 3.50;
    }

    /**
     * Gets the discount price of this item
     * 
     * @return The discount price of this item ($2.50)
     */
    public double getDiscountPrice() {
        //on sale for 2.50
        return 2.50;
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