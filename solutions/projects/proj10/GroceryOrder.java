import java.util.*;

/**
 * GroceryOrder represents an order of grocery items, which can
 * be either random or standard
 * 
 * @author Julie Thornton
 * @version Project 10
 */

public class GroceryOrder {
    private ArrayList<GroceryItem> items;
    private Random r;

    /**
     * Creates a new empty grocery order
     */
    public GroceryOrder() {
        items = new ArrayList<GroceryItem>();
        r = new Random();
    }

    /**
     * Adds an item to this grocery order
     * 
     * @param item The item to add to the order
     */
    public void addItem(GroceryItem item) {
        items.add(item);
    }

    /**
     * Creates a new random grocery order of 4-20 items in random configurations
     */
    public void createRandomOrder() {
        items.clear();

        //generate 4-20 items
        int count = r.nextInt(17)+4;

        for (int i = 0; i < count; i++) {
            //generate 0-5 for item type
            int whichItem = r.nextInt(6);

            GroceryItem item;

            if (whichItem == 0) {
                Apple a = new Apple();

                //randomly count of 1-5
                int itemCount = r.nextInt(5) + 1;
                a.setCount(itemCount);
                item = a;
            }
            else if (whichItem == 1) {
                item = new Chips();
            }
            else if (whichItem == 2) {
                //randomly frosted
                int frostNum = r.nextInt(2);
                boolean frost = false;
                if (frostNum == 1) frost = true;

                Donut d = new Donut(frost);

                //randomly count of 1-12
                int itemCount = r.nextInt(12) + 1;
                d.setCount(itemCount);
                item = d;
            }
            else if (whichItem == 3) {
                item = new Eggs();
            }
            else if (whichItem == 4) {
                //randomly organic
                int orgNum = r.nextInt(2);
                boolean org = false;
                if (orgNum == 1) org = true;

                Orange o = new Orange(org);

                //randomly count of 1-3
                int itemCount = r.nextInt(3) + 1;
                o.setCount(itemCount);
                item = o;
            }
            else  {
                //randomly hot
                int hotNum = r.nextInt(2);
                boolean hot = false;
                if (hotNum == 1) hot = true;

                item = new RotisserieChicken(hot);
            }

            addItem(item);
        }
    }

    /**
     * Creates a standard grocery order per the assignment instructions
     */
    public void createStandardOrder() {
        items.clear();

        //5 apples
        Apple a = new Apple();
        a.setCount(5);
        addItem(a);

        //chips
        addItem(new Chips());

        //4 frosted donuts
        Donut d = new Donut(true);
        d.setCount(4);
        addItem(d);

        //3 unfrosted donuts
        d = new Donut(false);
        d.setCount(3);
        addItem(d);

        //2 containers of eggs
        addItem(new Eggs());
        addItem(new Eggs());

        //3 organic oranges
        Orange o = new Orange(true);
        o.setCount(3);
        addItem(o);

        //1 hot rotisserie chicken, 1 cold rotisserie chicken
        addItem(new RotisserieChicken(true));
        addItem(new RotisserieChicken(false));
    }

    /**
     * Gets the total cost of all items in the grocery order, before any discounts
     * 
     * @return The total cost of all items before any discounts
     */
    public double getTotal() {
        double total = 0; 
        for (GroceryItem item : items) {
            total += item.getFullPrice();
        }
        return total;
    }

    /**
     * Gets the total cost of all items in the grocery order, after any discounts
     * 
     * @return The total cost of all items after any discounts
     */
    public double getDiscountedTotal() {
        double total = 0; 
        for (GroceryItem item : items) {
            if (item instanceof DiscountedItem) {
                DiscountedItem d = (DiscountedItem) item;
                total += d.getDiscountPrice();
            }
            else {
                total += item.getFullPrice();
            }
        }
        return total;
    }

    /**
     * Gets the total savings on the grocery order from applying all discounts
     * 
     * @return The total savings after applying discounts
     */
    public double getSavings() {
        return getTotal() - getDiscountedTotal();
    }

    /**
     * Gets all items in the grocery order
     * 
     * @return All grocery items in the order
     */
    public ArrayList<GroceryItem> getAllItems() {
        return items;
    }

    /**
     * Gets all countable items in the grocery order
     * 
     * @return All countable grocery items in the order
     */
    public ArrayList<CountableItem> getAllCountableItems() {
        ArrayList<CountableItem> filtered = new ArrayList<CountableItem>();
        for (GroceryItem item : items) {
            if (item instanceof CountableItem) {
                CountableItem c = (CountableItem) item;
                filtered.add(c);
            }
        }
        return filtered;
    }

    /**
     * Gets all discounted items in the grocery order
     * 
     * @return All discounted grocery items in the order
     */
    public ArrayList<DiscountedItem> getAllDiscountedItems() {
        ArrayList<DiscountedItem> filtered = new ArrayList<DiscountedItem>();
        for (GroceryItem item : items) {
            if (item instanceof DiscountedItem) {
                DiscountedItem d = (DiscountedItem) item;
                filtered.add(d);
            }
        }
        return filtered;
    }
}