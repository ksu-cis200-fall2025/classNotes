public class Donut {
    private boolean frosted;
    private int count;

    public Donut(boolean f) {
        frosted = f;
        count = 1;
    }

    public String getName() {
        if (frosted) return "Frosted Donut";
        else return "Plain Donut";
    }

   public void setCount(int num) {
        //only allow counts between 1-12
        if (num >= 1 && num <= 12) {
            count = num;
        }
    }

    public int getCount() {
        return count;
    }

    public double getUnitPrice() {
        if (frosted) return 1.50;
        else return 1.25;
    }

    public double getFullPrice() {
        return count*getUnitPrice();
    }

    public double getDiscountPrice() {
        //save 30% 
        return 0.7 * getFullPrice();
    }

    public String toString() {
        return String.format("%s, count: %d, price: $%.2f", getName(), getCount(), getFullPrice());
    }
}