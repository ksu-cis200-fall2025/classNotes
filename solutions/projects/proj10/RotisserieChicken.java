/**
 * Represents an Rotisserie chicken order
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class RotisserieChicken implements GroceryItem {
    private boolean hot;

    /**
     * Creates a new Rotisserie chicken order
     * 
     * @param h Whether this chicken is heated
     */
    public RotisserieChicken(boolean h) {
        hot = h;
    }

    /**
     * Gets the name of this item
     * 
     * @return THe name of this item
     */
    public String getName() {
        if (hot) return "Hot Rotisserie Chicken";
        else return "Rotisserie Chicken";
    }

    /**
     * Gets the full price of a chicken order
     * 
     * @return The full price of a chicken order
     */
    public double getFullPrice() {
        if (hot) return 7.99;
        else return 6.99;
    }

    /**
     * Gets a string representation of this item, including its name, count, and price
     * 
     * @return A string representation of this item
     */
    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getFullPrice());
    }
}