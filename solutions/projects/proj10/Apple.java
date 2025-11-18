/**
 * Represents an Apple
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class Apple implements CountableItem {
    private int count;

    /**
     * Creates a new Apple
     */
    public Apple() {
        count = 1;
    }

    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        return "Apple";
    }

    /**
     * Sets the count of the apples (only 1-5 allowed)
     * 
     * @param num The count of the apples
     */
    public void setCount(int num) {
        //only allow counts between 1-5
        if (num >= 1 && num <= 5) {
            count = num;
        }
    }

    /**
     * Gets the count of the apples
     * 
     * @return The count of the apples
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets the unit price of an apple
     * 
     * @return The unit price of an apple
     */
    public double getUnitPrice() {
        return 0.75;
    }

    /**
     * Gets the full price of an apple order
     * 
     * @return The full price of an apple order
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