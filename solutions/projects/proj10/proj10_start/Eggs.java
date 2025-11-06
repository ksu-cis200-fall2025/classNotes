public class Eggs {
    public String getName() {
        return "Eggs";
    }

    public double getFullPrice() {
        return 3.50;
    }

    public double getDiscountPrice() {
        //on sale for 2.50
        return 2.50;
    }

    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getFullPrice());
    }
}