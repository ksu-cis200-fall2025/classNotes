/**
 * Requirements for GroceryItems that are discounted
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public interface DiscountedItem extends GroceryItem {
    
    /**
     * Gets the discount price of this item
     * 
     * @return The discount price of this item
     */
    double getDiscountPrice();
}