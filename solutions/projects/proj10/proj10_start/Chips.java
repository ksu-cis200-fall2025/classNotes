public class Chips {
    public String getName() {
        return "Chips";
    }

    public double getDiscountPrice() {
        //on sale for 3.99
        return 3.99;
    }

    public double getFullPrice() {
        return 5.99;
    }

    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getFullPrice());
    }
}