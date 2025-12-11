using System;

public class Proj10 {
    public static void Main(string[] args) {
        if (args.Length == 1) {
            if (args[0] == "--standard") {
                GroceryOrder order = new GroceryOrder();
                order.CreateStandardOrder();

                PrintFullOrderInfo(order, "standard");
                PrintCountableItems(order, "standard");
                PrintDiscountedItems(order, "standard");
            }
            else if (args[0] == "--random") {
                GroceryOrder order = new GroceryOrder();
                order.CreateRandomOrder();

                PrintFullOrderInfo(order, "random");
                PrintCountableItems(order, "random");
                PrintDiscountedItems(order, "random");
            }
            else {
                Console.WriteLine("Invalid command line argument.");
                Console.WriteLine("Run as: dotnet run -- --standard");
                Console.WriteLine("Run as: dotnet run -- --random");
            }
        }
        else {
            Console.WriteLine("Missing command line argument.");
            Console.WriteLine("Run as: dotnet run -- --standard");
            Console.WriteLine("Run as: dotnet run -- --random");
        }
    }

    public static void PrintFullOrderInfo(GroceryOrder order, string type) {
        Console.WriteLine($"All grocery items from {type} order:");
        foreach (GroceryItem item in order.AllItems) {
            Console.WriteLine("\t" + item);
        }
        Console.WriteLine();

        Console.WriteLine($"Total before discounts: {order.Total:C}");
        Console.WriteLine($"Total after discounts: {order.DiscountedTotal:C}");
        Console.WriteLine($"Total savings: {order.Savings:C}");
        Console.WriteLine();
    }

    public static void PrintCountableItems(GroceryOrder order, String type) {
        Console.WriteLine($"Countable {type} grocery items:");
        foreach (CountableItem item in order.CountableItems) {
            Console.WriteLine($"\t{item}");
        }
        Console.WriteLine();
    }

    public static void PrintDiscountedItems(GroceryOrder order, String type) {
        Console.WriteLine($"Discounted {type} grocery items:");
        foreach (DiscountedItem item in order.DiscountedItems) {
            Console.WriteLine($"\t{item.Name}, full price: {item.FullPrice:C}, discounted price: {item.DiscountPrice:C}");
        }
        Console.WriteLine();
    }
}