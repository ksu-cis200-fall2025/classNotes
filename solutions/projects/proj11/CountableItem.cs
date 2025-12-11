public interface CountableItem : GroceryItem {
    int Count { get; set; }

    double UnitPrice { get; } 
}