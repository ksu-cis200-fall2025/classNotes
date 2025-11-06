public class Apple {
    private int count;

    public Apple() {
        count = 1;
    }

    public String getName() {
        return "Apple";
    }

    public void setCount(int num) {
        //only allow counts between 1-5
        if (num >= 1 && num <= 5) {
            count = num;
        }
    }

    public int getCount() {
        return count;
    }

    public double getUnitPrice() {
        return 0.75;
    }

    public double getFullPrice() {
        return count*getUnitPrice();
    }

    public String toString() {
        return String.format("%s, count: %d, price: $%.2f", getName(), getCount(), getFullPrice());
    }
}