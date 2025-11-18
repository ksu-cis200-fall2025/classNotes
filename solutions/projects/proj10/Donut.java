/**
 * Represents a Donut order
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class Donut implements CountableItem, DiscountedItem {
    private boolean frosted;
    private int count;

    /**
     * Creates a new Donut order
     * 
     * @param f Whether this donut order is frosted
     */
    public Donut(boolean f) {
        frosted = f;
        count = 1;
    }

    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        if (frosted) return "Frosted Donut";
        else return "Plain Donut";
    }

    /**
     * Sets the count of the donuts (only 1-12 allowed)
     * 
     * @param num The count of the donuts
     */
    public void setCount(int num) {
        //only allow counts between 1-12
        if (num >= 1 && num <= 12) {
            count = num;
        }
    }

    /**
     * Gets the count of the donuts
     * 
     * @return The count of the donuts
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets the unit price of a donut
     * 
     * @return The unit price of a donut
     */
    public double getUnitPrice() {
        if (frosted) return 1.50;
        else return 1.25;
    }

    /**
     * Gets the full price of a donut order
     * 
     * @return The full price of a donut order
     */
    public double getFullPrice() {
        return count*getUnitPrice();
    }

     /**
     * Gets the discount price of this item
     * 
     * @return The discount price of this item (30% off)
     */
    public double getDiscountPrice() {
        //save 30%
        return 0.7 * getFullPrice();
    }

    /**
     * Gets a string representation of this item, including its name, count, and price
     * 
     * @return A string representation of this item
     */
    public String toString() {
        return String.format("%s, count: %d, price: $%.2f", getName(), getCount(), getFullPrice());
    }
}