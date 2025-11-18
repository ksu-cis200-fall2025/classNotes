/**
 * Represents an Orange order
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class Orange implements CountableItem {
    private int count;
    private boolean organic;

    /**
     * Creates a new Orange order
     * 
     * @param o Whether this orange is organic
     */
    public Orange(boolean o) {
        organic = o;
        count = 1;
    }

    /**
     * Gets the name of this item
     * 
     * @return THe name of this item
     */
    public String getName() {
        if (organic) return "Organic Orange";
        else return "Orange";
    }

    /**
     * Sets the count of the oranges (only 1-3 allowed)
     * 
     * @param num The count of the donuts
     */
    public void setCount(int num) {
        //only allow counts between 1-3
        if (num >= 1 && num <= 3) {
            count = num;
        }
    }

    /**
     * Gets the count of the oranges
     * 
     * @return The count of the oranges
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets the unit price of an orange
     * 
     * @return The unit price of an orange
     */
    public double getUnitPrice() {
        if (organic) return 1.25;
        else return 0.99;
    }

    /**
     * Gets the full price of an orange
     * 
     * @return The full price of an orange order
     */
    public double getFullPrice() {
        return count*getUnitPrice();
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