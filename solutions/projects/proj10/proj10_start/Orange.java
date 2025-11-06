public class Orange {
    private int count;
    private boolean organic;

    public Orange(boolean o) {
        organic = o;
        count = 1;
    }

    public String getName() {
        if (organic) return "Organic Orange";
        else return "Orange";
    }

    public void setCount(int num) {
        //only allow counts between 1-3
        if (num >= 1 && num <= 3) {
            count = num;
        }
    }

    public int getCount() {
        return count;
    }

    public double getUnitPrice() {
        if (organic) return 1.25;
        else return 0.99;
    }

    public double getFullPrice() {
        return count*getUnitPrice();
    }

    public String toString() {
        return String.format("%s, count: %d, price: $%.2f", getName(), getCount(), getFullPrice());
    }
}