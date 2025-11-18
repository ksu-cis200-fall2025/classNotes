/**
 * Requirements for GroceryItems that are countable
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public interface CountableItem extends GroceryItem {
    
    /**
     * Sets the count of the item)
     * 
     * @param num The count of the item
     */
    void setCount(int num);

    /**
     * Gets the count of the item
     * 
     * @return The count of the item
     */
    int getCount();

    /**
     * Gets the unit price of an item
     * 
     * @return The unit price of an item
     */
    double getUnitPrice();
}