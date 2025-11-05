public class Shirt {
    private ShirtColor color;
    private int count;
    
    public Shirt(ShirtColor c) {
        color = c;
        count = 1;
    }

    public void setCount(int c) {
        if (c > 0) {
            count = c;
        }
        //don't change count unless new value is positive
    }

    public void setColor(ShirtColor newColor) {
        color = newColor;
    }

    protected double unitCost() {
        //find the unit cost

    }

    public double orderCost() {
        double unitCost = 0;
        switch (color) {
            case White:
            case Black:
            case Gray:
                unitCost = 14.99;
                break;
            default:
                unitCost = 16.99;
                break;
        }

        return count*unitCost();
    }

    protected String getName() {
        return "Shirt";
    }

    public String toString() {
        return String.format("%s order, color: %s, count: %d, cost: $%.2f", getName() color, count, orderCost());
    }
}